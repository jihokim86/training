package test2;

import java.util.Scanner;

public class MultiplicationTable {
	static int test(int a) {
		do {
			System.out.print("���Է�:");
			
		}while();
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
		System.out.print("������ �� ��:");
		int a = input.nextInt();
		if(!(a ==0)||a ==1) {
			System.out.println(a+"�� ���");
			for(int j=1 ; j<=9 ;j++) {
				System.out.printf("%2d *%2d =  %2d\n",a,j,a*j);
			}
		}else {
			System.out.println("���α׷��� �����մϴ�");
			break;
		}
	 }
	}
}
