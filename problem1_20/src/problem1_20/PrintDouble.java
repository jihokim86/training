package problem1_20;

import java.util.Scanner;

public class PrintDouble {
	
	static void printDouble(double x, int p, int w) {
		System.out.printf(String.format("%%%d.%df",w,p),x);
	}
	//

	public static void main(String[] args) {
		// �ε��Ҽ��� �� x���� �Ҽ��� ���� �κ� p�ڸ���, �׸��� ��ü�� ��� w�ڸ���
		//ǥ���ϴ� �żҸ��� �ۼ�����.
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�Ǽ� ��:");
		Double x = stdIn.nextDouble();
		
		System.out.print("��ü�ڸ���:");
		int w = stdIn.nextInt();
		
		System.out.print("�Ҽ��� �ڸ���:");
		int p = stdIn.nextInt();
		
		printDouble(x,p,w);
		System.out.println();
	}
}
