package problem1_5;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		// ��ȣ���� * �� �����ؼ� n���� �������� ǥ���ϴ� ���α׷��� �ۼ�
		
		Scanner input = new Scanner(System.in);
		int a;
		System.out.println("�������� ǥ���մϴ�.");
		do {
			System.out.print("�ܼ��� :");
			a= input.nextInt();
		}while(a<0);
		
		for(int i=0; i<a ; i++) {
			for(int j=0; j<a;j++) {
			System.out.print("*");
		}
			System.out.println();
	  }
		input.close();
	}
}
