package problem1_3;

import java.util.Scanner;

public class DigiNo {

	public static void main(String[] args) {
//���� �������� �о �� �ڸ����� ����ϴ� ���α׷��� �ۼ�.
		
		Scanner input = new Scanner(System.in);
		int a;
		do {
		System.out.println("���� �������� �Է��ϼ���");
		a= input.nextInt();
		}while(a<=0);
		
		int digit=0;
		
		while(a>0) {
			digit++;
			a =a/10;
		}
		System.out.println("�Է��� ���ڴ�"+digit+"�ڸ��Դϴ�.");
		input.close();
	}
}
