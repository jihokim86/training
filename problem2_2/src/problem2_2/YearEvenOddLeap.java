package problem2_2;

import java.util.Scanner;

public class YearEvenOddLeap {

	public static void main(String[] args) {
		// int year = 2004 ó�� �⵵�� �����ϸ� Ȧ/¦/������ ����
		
		Scanner input = new Scanner(System.in);
		System.out.println("=== �Է� �⵵�� Ȧ/¦/���� �Ǻ� ===");
		System.out.print("�⵵�� �Է��ϼ��� : ");
		int year = input.nextInt();
		int a = year%2; //0 or 0�� �ƴ� ��
		int b = year%4; //0 or 0�� �ƴ� ��
		
		if(a*b==0) {
			System.out.println("�Է��� �⵵�� ¦�����̸鼭 �����Դϴ�.");
		}else if(a==0) {
			System.out.println("�Է��� �⵵�� ¦�����̸鼭 ������ �ƴմϴ�.");
		}else {
			System.out.println("�Է��� �⵵�� Ȧ�����̸鼭 ������ �ƴմϴ�.");
		}
		input.close();
	}
}
