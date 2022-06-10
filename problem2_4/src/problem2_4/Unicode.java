package problem2_4;

import java.util.Scanner;

public class Unicode {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("문자를 입력하면 유니코드로 변환해 드립니다.:");
		String s = input.next();
		for(int i=0; i<s.length();i++)
		System.out.printf("%s : %d\n",s.charAt(i),(int)s.charAt(i));
		
	}

}



