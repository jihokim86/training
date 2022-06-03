package problem1_20;

import java.util.Scanner;

public class StringCode {

	public static void main(String[] args) {
		//문자열을 한 글자씩 확인해서 문자 코드로 표시
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("문자열:");
		String s = stdIn.next();
		for(int i=0; i<s.length();i++) {
			System.out.printf("s[%d] = %c %4X \n",i,s.charAt(i),(int)s.charAt(i));
		}
	}

}
