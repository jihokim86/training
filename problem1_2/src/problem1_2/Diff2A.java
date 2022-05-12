package problem1_2;
import java.util.Scanner;

public class Diff2A {

	public static void main(String[] args) {
//읽은 두 정수값의 차를 표시(if문)
		Scanner input = new Scanner(System.in);
		
		System.out.println("정수 A값을 입력하세요.");
		int a = input.nextInt();
		System.out.println("정수 B값을 입력하세요");
		int b = input.nextInt();
		
		if(a>=b) {
		System.out.println("두 값의 차는 "+(a-b)+"입니다.");
		}else {
		System.out.println("두 값의 차는 "+(b-a)+"입니다.");
		
	input.close();
	}
  }
}
