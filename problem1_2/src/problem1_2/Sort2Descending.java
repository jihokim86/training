package problem1_2;

import java.util.Scanner;

public class Sort2Descending {

	public static void main(String[] args) {
//2���� ���� ���� ��������(ū��)���� �����ϴ� ���α׷��� �ۼ�
		Scanner input = new Scanner(System.in);
		System.out.println("���� 2���� �Է��Ͻø� ������������ �����մϴ�.");
		int a = input.nextInt();
		int b = input.nextInt();
		
		if(a<b) {
			int t=a;
			a=b;
			b=t;
		}
		System.out.printf("�Է��� ������ ������������ �����մϴ�.\n%d,%d",a,b);
	input.close();
	}

}
