package problem2_6;

public class Pyrimid {

	public static void main(String[] args) {
		//문자 피라미터 출력 
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
		
	//4등분 1. 왼쪽상단 / 오른쪽상단 / 왼쪽하단 / 오른쪽하단
	int cnt=0;	//각 행마다 배열길이의 조건 설정							
		for(int i=1 ; i<=str.length;i++) {
			for(int j=str.length ; j>=i ; j--) {	//왼쪽상단 공백
				System.out.print("*");
			}
			cnt++;	//각행마다 동작 횟수 카운터
			for(int k=0;k<1;k++) {					//왼쪽상단 문자
				for(int h=0 ;h<cnt;h++) {	
				System.out.print(str[h]);
				}
			for(int p=0;p<1;p++) {					//오른쪽상단 문자
				for(int h=cnt-1 ;h>=0;h--) {
				System.out.print(str[h]);
					}
			System.out.println();
		  }
	   }
	}
	
	//반대 뒤집기
	int cnt2=6;
		for(int i1=1 ; i1<=str.length;i1++) {		//왼쪽상단 공백
			for(int j1=1 ; j1<=i1 ; j1++) {
				System.out.print("*");
			}
			cnt2--;
			for(int p1=0;p1<1;p1++) {				//왼쪽하단 문자
				for(int h1=0 ;h1<cnt2;h1++) {
				System.out.print(str[h1]);
				}
				
			for(int p2=0;p2<1;p2++) {				//오른쪽하단 문자
				for(int h2=cnt2-1 ;h2>=0;h2--) {
					System.out.print(str[h2]);
					}
			
			System.out.println();
		  }
	   }
				
	}
	}
}
