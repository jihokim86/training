package problem2_3;

import java.util.Scanner;

public class ShiftExample {

	public static void main(String[] args) {
		//�������� ����Ʈ �� ����� ���ڸ� �Է��ϸ� �� ����� ���
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("�������� �Է��ϼ���");
		int x = input.nextInt();
		
		int retry;
		do {
			System.out.print("����Ʈ�� ������ ���ϼ���.(1)������ (2)���� :");
			retry=input.nextInt();
		}while(retry<1 && retry>2);
		
		if(retry==1) {
			System.out.print("�󸶸�ŭ ����Ʈ ��Ű�ڽ��ϱ�? :");
			int a = input.nextInt();
			int b = x >> a;
			System.out.print("����Ʈ�� ����"+b+"�Դϴ�");
		}
		
		if(retry==2) {
			System.out.print("�󸶸�ŭ ����Ʈ ��Ű�ڽ��ϱ�? :");
			int a = input.nextInt();
			int b = x << a;
			System.out.print("����Ʈ�� ����"+b+"�Դϴ�");
		}
	}

}
