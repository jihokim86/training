package problem2_2;

import java.util.Scanner;

public class EngCapLow {

	public static void main(String[] args) {
		//영문자를 입력하면 소문자는 대문자로 대문자는 소문자로 출력
		
		Scanner input = new Scanner(System.in);
		
		String s = input.next();
		
		
	
		for(int i=0; i<s.length();i++) {
			char chr = s.charAt(i);
			if(chr>='A' && chr<='Z') { //대문자일 경우
				chr = (char) (chr+32);
				System.out.print(chr);
		}else {
			chr=(char) (chr-32);
			System.out.print(chr);
		}
	}
	}
}

