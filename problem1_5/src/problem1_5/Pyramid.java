package problem1_5;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		//n�� �Ƕ�̵带 ǥ���ϴ� ���α׷��� �ۼ�
		//i��°���� (i-1)*2+1 ��
		//n��°�� (n-1)*2+1 ��
		
		Scanner input = new Scanner(System.in);
		System.out.println("�Ƕ�̵带 ǥ���մϴ�");
		int a;
		do {
			System.out.print("�ܼ���:");
			a = input.nextInt();
		}while(a<0);
			
		for(int i=0; i<a ; i++) {
			for(int j=0; j<a-i+1;j++) {
				System.out.print(" ");
			}
			for(int k=0; k<(i-1)*2+1 ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		input.close();
	}
}
