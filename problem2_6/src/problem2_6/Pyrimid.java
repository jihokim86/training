package problem2_6;

public class Pyrimid {

	public static void main(String[] args) {
		//���� �Ƕ���� ��� 
		PyramidClass.pyrimid1();
		
		
//			
//		   String[] str = {"a","b","c","d"};
//		   for(int j=0;j<str.length;j++) {
//			 for(int i=0 ; i<=j;i++) {
//				 System.out.print(str[i]);
//			 }
//			 System.out.println();
//		   }
	
	}
}

class PyramidClass {
	public static void pyrimid1() {
		String[] str = {"a","b","c","d","e"};
		
	//4��� 1. ���ʻ�� / �����ʻ�� / �����ϴ� / �������ϴ�
	int cnt=0;	//�� �ึ�� �迭������ ���� ����							
		for(int i=1 ; i<=str.length;i++) {
			for(int j=str.length ; j>=i ; j--) {	//���ʻ�� ����
				System.out.print("*");
			}
			cnt++;	//���ึ�� ���� Ƚ�� ī����
			for(int k=0;k<1;k++) {					//���ʻ�� ����
				for(int h=0 ;h<cnt;h++) {	
				System.out.print(str[h]);
				}
			for(int p=0;p<1;p++) {					//�����ʻ�� ����
				for(int h=cnt-1 ;h>=0;h--) {
				System.out.print(str[h]);
					}
			System.out.println();
		  }
	   }
	}
	
	//�ݴ� ������
	int cnt2=6;
		for(int i1=1 ; i1<=str.length;i1++) {		//���ʻ�� ����
			for(int j1=1 ; j1<=i1 ; j1++) {
				System.out.print("*");
			}
			cnt2--;
			for(int p1=0;p1<1;p1++) {				//�����ϴ� ����
				for(int h1=0 ;h1<cnt2;h1++) {
				System.out.print(str[h1]);
				}
				
			for(int p2=0;p2<1;p2++) {				//�������ϴ� ����
				for(int h2=cnt2-1 ;h2>=0;h2--) {
					System.out.print(str[h2]);
					}
			
			System.out.println();
		  }
	   }
				
	}
	}
}
