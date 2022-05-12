package problem1_2;
import java.util.Scanner;

public class Diff2Digits2 {

	public static void main(String[] args) {
// 읽은 두 값의 차가 11이상인지를 표시(방법2:조건연산문 삼항연산자)
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("A값을 입력하세요");
		int a= input.nextInt();
		System.out.println("B값을 입력하세요");
		int b= input.nextInt();
		int c = (a-b)>=11 ? 1 : 2 ;
		
		switch(c){
		case 1:
			System.out.println("두 값의 차이는 11이상입니다.");
			break;
		case 2:
			System.out.println("두 값의 차이는 11미만입니다.");
			break;
		}
	input.close();
	}
}
