package problem1_5;

import java.util.Scanner;

public class IsoscelesTriangleLB {

	public static void main(String[] args) {
		//��ȣ ���� * �����ؼ� ������ �̵ �ﰢ���� ǥ���ϴ� ���α׷��� �ۼ�
		//������ ��ġ�� ���ʾƷ�,������,�����ʾƷ�,���������� ǥ��
		Scanner input = new Scanner(System.in);
		int a;
		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ���� ǥ���մϴ�.");
		do {
			System.out.print("�ܼ���?:");
			a= input.nextInt();
		}while(a<0);
		
		for(int i=1; i<=a ; i++) {
			for(int j=0; j<i ; j++) {
			System.out.print("*");
		  }
			System.out.println();
		}
		input.close();
	}
}
