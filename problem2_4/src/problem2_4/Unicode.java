package problem2_4;

import java.util.Scanner;

public class Unicode {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϸ� �����ڵ�� ��ȯ�� �帳�ϴ�.:");
		String s = input.next();
		for(int i=0; i<s.length();i++)
		System.out.printf("%s : %d\n",s.charAt(i),(int)s.charAt(i));
		
	}

}



