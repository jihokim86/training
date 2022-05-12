package problem1_2;
import java.util.Scanner;
public class Max2A {

	public static void main(String[] args) {
		// 읽은 2개의 실수값 중에서 큰 쪽을 표시(방법1:if문)
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("실수 A를 입력하세요");
		double num1 = input1.nextDouble();
		System.out.println("실수 B를 입력하세요");
		double num2 = input1.nextDouble();
		
		if(num1>num2) {
			System.out.println("입력한 값중 큰 수는 실수 A="+num1+"입니다");
		}else if(num1<num2) {
			System.out.println("입력한 값중 큰 수는 실수 B="+num2+"입니다");
		}else {
			System.out.println("입력한 값의 크기가 같습니다.");
		}
		input1.close();
	}

}
