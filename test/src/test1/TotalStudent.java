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
		double min=100.0; // min =scores[0]을 사용해도 됨
		char grade = 0;
		double[] ave= new double[5];
		double[] ave1= new double[5];
		int [] ave2= new int[5];
		 
		 for(int i=0;i<kuk.length;i++) {
			 sum[i] = kuk[i] + eng[i] + mat[i];
			 
			 ave[i] = (double)sum[i] / 3.0;
			 ave1[i] = (double)(Math.round(ave[i]*10))/10;  // 평균점수소수점 반올림,평균점수 출력하기 위한
			 ave2[i] = (int)(Math.round(ave1[i]*10))/10;	// 평균을 이용한 학점 구하기위해. switch문 정수값넣기위해
			 
			 if(ave1[i]>max) { // 최대값 구하기
				 max= ave1[i];
			 }
			 if(ave1[i]<min) { // 최소값 구하기
				 min = ave1[i];
			 }
			
		 }
		 
		 
		 for(int i=0; i<sum.length;i++) {
				myRank[i]=1; //0번째 방의 값을 1(1등)을 넣음
				for(int j=0;j<sum.length;j++) {
					if(sum[i]<sum[j]) {
						myRank[i] +=1;
						
					}
				}
			}
			
//		 System.out.println("번호"+"\t"+"이름"+"\t"+"국어"+"\t"+"영어"+"\t"+"수학"+"\t"+"총점"+"\t"+"학점"+"\t"+"등수"+"\t");
		 
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
			
			 //System.out.printf("%d%c",(i+1),nameStudent[i]);// 왜 안될까?
			 
//			 System.out.printf("%c",nameStudent[i]);
			 
			 System.out.println(" "+(i+1)+"\t"+nameStudent[i]+"\t"+kuk[i]+"\t"+eng[i]+"\t"+mat[i]+
					 "\t"+sum[i]+"\t"+ ave1[i]+"\t"+" "+grade +"\t"+" "+myRank[i]);
		 }
		 System.out.println("====================================================================");
		 System.out.println("평균 최고점수 : "+ max);
		 System.out.println("평균 최저점수 : "+ min);
	}//end of main
	
	
	public static void headTitle() {
		System.out.println("                             성 적 표");
		System.out.println("====================================================================");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t학점\t등수");
		return;
	}

	
	public static void resultTilte() {
		
	}
	
	
}//end of class
