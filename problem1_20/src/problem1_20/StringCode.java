package problem1_20;

import java.util.Scanner;

public class StringCode {

	public static void main(String[] args) {
		//���ڿ��� �� ���ھ� Ȯ���ؼ� ���� �ڵ�� ǥ��
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���ڿ�:");
		String s = stdIn.next();
		for(int i=0; i<s.length();i++) {
			System.out.printf("s[%d] = %c %4X \n",i,s.charAt(i),(int)s.charAt(i));
		}
	}

}
