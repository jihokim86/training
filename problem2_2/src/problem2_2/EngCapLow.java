package problem2_2;

import java.util.Scanner;

public class EngCapLow {

	public static void main(String[] args) {
		//�����ڸ� �Է��ϸ� �ҹ��ڴ� �빮�ڷ� �빮�ڴ� �ҹ��ڷ� ���
		
		Scanner input = new Scanner(System.in);
		
		String s = input.next();
		
		
	
		for(int i=0; i<s.length();i++) {
			char chr = s.charAt(i);
			if(chr>='A' && chr<='Z') { //�빮���� ���
				chr = (char) (chr+32);
				System.out.print(chr);
		}else {
			chr=(char) (chr-32);
			System.out.print(chr);
		}
	}
	}
}

