package problem2_3;

public class OperatorExample {

	public static void main(String[] args) {
		//전위 연산자와 후위 연산자의 차이를 보여 줄 수 있는 코드 작성
		int a1=1;
		
		a1++;					// 1 -> 2
		
		int a2 = a1++;			//선대입 후 증가 a2=2 ,a1:2 -> 3
		int a3 = ++a1;			//증가 후 대입 a1:3->4 , a3=4
		int b1 = a1+++a1;		//++이 먼저 우에서 좌로 a1+(++a1)
		int b2 = ++a1+a1;		//++이 먼저 우에서 좌로 a1:5->6 , 6+6=12
		
		System.out.println(a2); //2
		System.out.println(a3); //4
		System.out.println(b1); //9
		System.out.println(b2); //12
		
	}
}
