package problem1_2;
import java.util.Scanner;

public class Max2B {

	public static void main(String[] args) {
		//2개의 실수 값을 읽어서 큰 쪽을  표시(방법2 : 조건 연산자, 삼항연산자)
				Scanner input1 = new Scanner(System.in);
				
				System.out.println("실수 A를 입력하세요");
				double num1 = input1.nextDouble();
				System.out.println("실수 B를 입력하세요");
				double num2 = input1.nextDouble();
				
				//삼항연산자 조건식 ? 값 또는 연산식 : 값 또는 연산식
				double a=(num1>num2) ? num1 :((num1<num2) ? num2 : 'a');
				if(a=='a') {
					System.out.println("입력한 값이 같습니다.");
				}else {
				System.out.println("입력한 값 중 큰 실수는 "+a+"입니다");
				}
				
				input1.close();
	}
}
