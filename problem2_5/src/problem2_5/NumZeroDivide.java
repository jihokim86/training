package problem2_5;

import java.util.Scanner;

public class NumZeroDivide {

	public static void main(String[] args) {
		// ���ڸ� 0���� ������ ���� �߻�
		try {
		Scanner input = new Scanner(System.in);
		System.out.println("�ΰ��� ���� �Է��ϼ���");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = a/b;
		
		System.out.println(c);
		}catch (Exception e) {
			System.out.println("0���� ������ ����");
		}
			
		
	}

}
