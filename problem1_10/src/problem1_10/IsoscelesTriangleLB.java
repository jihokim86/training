package problem1_10;

import java.util.Scanner;

public class IsoscelesTriangleLB {
	//���� c�� n���� ǥ���ϴ� �޼ҵ� putChar
	static void putChar(char c,int n) {
		while(n-- > 0) {
			System.out.print(c);
		}
	}
	
//	static void putStar(int n) {
//		putChar();
//	}

	public static void main(String[] args) {
		//���� c�� n���� ǥ���ϴ� putChar �żҵ�� �� �żҵ带 ���ο��� ȣ���ؼ�
		// ���� * �� n�� �������� ǥ���ϴ� putStar�żҵ带 �ۼ�
		//�� �żҵ带 �̿��ؼ� �����ﰢ���� ������.
		Scanner input = new Scanner(System.in);
		
		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ���� ǥ���մϴ�.");
		System.out.print("�ܼ���:");
		int n = input.nextInt();
		for(int i =1 ; i <=1+(n-1) ; i++) {
			for (int j = 0; j < i; j++) {
				putChar('*',n);
			}
			System.out.println();
		}
		
	}
}
