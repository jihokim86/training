package problem1_2;
import java.util.Scanner;

public class Diff2B {

	public static void main(String[] args) {
// 읽은 두 정수값의 차를 표시(조건연산자,삼항연산자)
		Scanner input = new Scanner(System.in);
		
		System.out.println("정수 A값을 입력하세요.");
		int a = input.nextInt();
		System.out.println("정수 B값을 입력하세요");
		int b = input.nextInt();
		
		int c = a>=b ? a-b : b-a;
		System.out.println("두 값의 차는 " + c +"입니다.");
	input.close();
		}
}
