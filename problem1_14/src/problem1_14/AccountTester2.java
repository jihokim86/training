package problem1_14;

import java.util.Scanner;

public class AccountTester2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���� ������ �Է��ϼ���.");
		System.out.print("��    ��:");
		String name = stdIn.next();
		System.out.print("��    ȣ:");
		String no = stdIn.next();
		System.out.print("��    ��:");
		long balance = stdIn.nextLong();
		System.out.print("����  ����:");
		int y = stdIn.nextInt();
		System.out.print("���� ��:");
		int m = stdIn.nextInt();
		System.out.print("���� ��:");
		int d = stdIn.nextInt();
		
		Account1 a = new Account1(name, no, balance, new Day(y, m, d));
		
		System.out.println("���� �⺻ ����:" + a);
		System.out.println("������:" + a.getOpenDay().toString());
	 
		stdIn.close();
	}

}
