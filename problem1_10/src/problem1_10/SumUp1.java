package problem1_10;

import java.util.Scanner;

public class SumUp1 {
	static int sumUp(int a) {
		int sum=0;
		for (int i = 0; i <= a; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		//1���� n������ ������ ���� ���ؼ� ��ȯ�ϤӴ� �ż��带 �ۼ�
		Scanner input = new Scanner(System.in);
		System.out.println("1���� x������ ���� ������.");
		int x;
		do {
		System.out.print("x�� �� :");
		x =input.nextInt();
		}while(x<=0);
		System.out.println("1����"+ x+"������ ������ �� : "+sumUp(x));
		input.close();
	}
}
