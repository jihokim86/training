package problem1_20;

import java.util.Scanner;

public class CompareSring {

	public static void main(String[] args) {
		//Ű���忡�� �Է��� 2���� ���ڿ��� ������ �����ϴ� ���α׷��� �ۼ�
		
		Scanner stdIn= new Scanner(System.in);
		
		System.out.print("���ڿ� s1:"); String s1 = stdIn.next();
		System.out.print("���ڿ� s2:"); String s2 = stdIn.next();
		
		if(s1 == s2) {
			System.out.println("s1�� s2 ������ �����ϴ�");
		}else {
			System.out.println("s1�� s2 ������ �ٸ���");
		}
		
		if(s1.equals(s2)) {
			System.out.println("s1�� s2 ������ �����ϴ�");
		}else {
			System.out.println("s1�� s2 ������ �ٸ���");
		}
	}

}
