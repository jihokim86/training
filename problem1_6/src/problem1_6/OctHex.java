package problem1_6;

import java.util.Scanner;

public class OctHex {

	public static void main(String[] args) {
		// 10진수를 읽어서 8진수,16진수로 표시
		Scanner input = new Scanner(System.in);
		
		System.out.println("정수:");
		int x = input.nextInt();
		
		System.out.printf("8진수는 %o입니다.\n",x);
		System.out.printf("16진수는 %x입니다.\n",x);
		input.close();
	}

}
