package problem1_3;

import java.util.Scanner;

public class Numver2digits {

	public static void main(String[] args) {
//2�ڸ��� ���� ��(10~99)�� ���ߴ� ���ڸ��߱������ ������.
//���� ������ if�� �׸��� do���� ����� ��.
		
		Scanner input = new Scanner(System.in);
		
		int num = (int)(Math.random()*99)+10;
		int num1;
		System.out.println(num);
		System.out.println("���� ���߱� ���� ����!");
		System.out.println("10���� 99������ ���ڸ� �Է��ϼ���");
		
		do {
			num1 = input.nextInt();
			if(num1>num) {
				System.out.println("�� ���� �����Դϴ�.");
			}else if(num1<num) {
				System.out.println("�� ū �����Դϴ�");
			}else
				System.out.println("�����Դϴ�.");
		}while(num != num1);
		input.close();
	}

}
