package problem1_2;

public class FingerFlashing {

	public static void main(String[] args) {
//0,1,2중 하나의 난수를 생성해서 가위,바위,보를 표시해라
		
		System.out.print("컴퓨터가 낸 것:");
		int a=(int)(Math.random()*3);
	
		switch(a) {
		case 0:
			System.out.println("가위"); break;
		case 1:
			System.out.println("바위"); break;
		case 2:
			System.out.println("보"); break;
	   }
	}

}
