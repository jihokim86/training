package test1;

public class TotalStudent {
	public static void main(String[] args) {
	
		String[] nameStudent = {"aaa","bbb","ccc","ddd","eee"};
		int[] kuk = {85,100,100,60,100};
		int[] eng = {16,90,58,100,94};
		int[] mat = {10,50,20,100,100};
		int[] myRank = new int[5];
		int[] sum = new int[5];
		int max=0;
		int min=300; // min =scores[0] 0�� �迭���� �־���.
		char grade = 0;
		 
		 for(int i=0;i<kuk.length;i++) {
			 sum[i] = kuk[i] + eng[i] + mat[i];
		
			 if(sum[i]>max) {
				 max= sum[i];
			 }
			 if(sum[i]<min) {
				 min = sum[i];
			 }
			
		 }
		 
		 for(int i=0; i<sum.length;i++) {
				myRank[i]=1; //0��° ���� ���� 1(1��)�� ����
				for(int j=0;j<sum.length;j++) {
					if(sum[i]<sum[j]) {
						myRank[i] +=1;
						
					}
				}
			}
			
		 System.out.println("��ȣ"+"\t"+"�̸�"+"\t"+"����"+"\t"+"����"+"\t"+"����"+"\t"+"����"+"\t"+"����"+"\t"+"���"+"\t");
		
		 for(int i=0; i<sum.length; i++) {
			 switch(sum[i]/30) {
				case 10:
				case 9:
					grade = 'A'; break;
				case 8:
					grade = 'B'; break;
				case 7:
					grade = 'C'; break;
				case 6:
					grade = 'D'; break;
				default:
					grade = 'F'; 
				}
			 System.out.println((i+1)+"\t"+nameStudent[i]+"\t"+kuk[i]+"\t"+eng[i]+"\t"+mat[i]+
					 "\t"+sum[i]+"\t"+ grade +"\t"+myRank[i]);
		 }
	}//end of main
}//end of class
