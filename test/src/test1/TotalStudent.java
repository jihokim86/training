package test1;

public class TotalStudent {
	public static void main(String[] args) {
	
		String[] nameStudent = {"aaa","bbb","ccc","ddd","eee"};
		int[] kuk = {85,100,100,60,100};
		int[] eng = {16,90,58,100,94};
		int[] mat = {10,50,20,100,100};
		int[] myRank = new int[5];
		int[] sum = new int[5];
		double max=0.0;
		double min=100.0; // min =scores[0]�� ����ص� ��
		char grade = 0;
		double[] ave= new double[5];
		double[] ave1= new double[5];
		int [] ave2= new int[5];
		 
		 for(int i=0;i<kuk.length;i++) {
			 sum[i] = kuk[i] + eng[i] + mat[i];
			 
			 ave[i] = (double)sum[i] / 3.0;
			 ave1[i] = (double)(Math.round(ave[i]*10))/10;  // ��������Ҽ��� �ݿø�,������� ����ϱ� ����
			 ave2[i] = (int)(Math.round(ave1[i]*10))/10;	// ����� �̿��� ���� ���ϱ�����. switch�� �������ֱ�����
			 
			 if(ave1[i]>max) { // �ִ밪 ���ϱ�
				 max= ave1[i];
			 }
			 if(ave1[i]<min) { // �ּҰ� ���ϱ�
				 min = ave1[i];
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
			
//		 System.out.println("��ȣ"+"\t"+"�̸�"+"\t"+"����"+"\t"+"����"+"\t"+"����"+"\t"+"����"+"\t"+"����"+"\t"+"���"+"\t");
		 
		 headTitle();
		 
		 for(int i=0; i<sum.length; i++) {
			 switch(ave2[i]/10) {
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
			
			 //System.out.printf("%d%c",(i+1),nameStudent[i]);// �� �ȵɱ�?
			 
//			 System.out.printf("%c",nameStudent[i]);
			 
			 System.out.println(" "+(i+1)+"\t"+nameStudent[i]+"\t"+kuk[i]+"\t"+eng[i]+"\t"+mat[i]+
					 "\t"+sum[i]+"\t"+ ave1[i]+"\t"+" "+grade +"\t"+" "+myRank[i]);
		 }
		 System.out.println("====================================================================");
		 System.out.println("��� �ְ����� : "+ max);
		 System.out.println("��� �������� : "+ min);
	}//end of main
	
	
	public static void headTitle() {
		System.out.println("                             �� �� ǥ");
		System.out.println("====================================================================");
		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����\t���");
		return;
	}

	
	public static void resultTilte() {
		
	}
	
	
}//end of class
