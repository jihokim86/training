package problem1_9;

import java.util.Scanner;

public class Min3 {
	static int min(int a, int b, int c) {
		int min=a;
		if(b<min) {
			min=b;
		}
		if(c<min) {
			min=c;
		}
		return min;
	}

	public static void main(String[] args) {
		//3���� int�� �μ� a,b,c �� �ּҰ��� ���ϴ� min �ż��带 �ۼ�
		Scanner input = new Scanner(System.in);
		System.out.printf("���� a:"); int a = input.nextInt();
		System.out.printf("���� b:"); int b = input.nextInt();
		System.out.printf("���� b:"); int c = input.nextInt();
		System.out.println("�ּ� ����"+min(a,b,c)+"�Դϴ�");
	}
}
