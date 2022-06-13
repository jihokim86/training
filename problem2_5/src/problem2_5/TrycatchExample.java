package problem2_5;

import java.util.Scanner;

public class TrycatchExample {

	public static void main(String[] args) {
		//숫자를 입력하지 않으면 Exception이 발생하도록 하시오
		try {
			Scanner input = new Scanner(System.in);
			System.out.println("숫자를 입력해");
			int num = input.nextInt();
			System.out.printf("입력한 숫자는 %s입니다",num);
			
		} catch (Exception e) {
			System.out.println("숫자만 입력 가능합니다.");
		}
	}
}
