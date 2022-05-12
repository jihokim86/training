package problem1_2;
import java.util.Scanner;

public class Diff2Digits1 {
	public static void main(String[] args) {
		// 두 정수값의 차가 10이하인 경우 " 두 값의 차는 10이하입니다"
		// 그렇지 않으면 "두 값의 차는 11이상입니다" 출력 (if문 사용)
				
				Scanner input1 = new Scanner(System.in);
				System.out.println("정수 A값을 입력하세요.");
				int a = input1.nextInt();
				System.out.println("정수 B값을 입력하세요");
				int b = input1.nextInt();
				int c = a-b;
						
				if(c>11) {
					System.out.println("두 값의 차는 11이상입니다.");
				}else {
					System.out.println("두 값의 차는 10이하입니다.");
				}
				input1.close();
			}
}
