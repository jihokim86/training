package problem1_9;

import java.util.Scanner;

public class Med3 {
	static int med3(int a, int b, int c) {
		if(a>=b) {
			if(b>=c) {
				return b;
			}else if(a<=c) {
				return a;
			}else {
				return c;
			}
		}else if(a>c) {
			return a;
		}else if(b>c) {
			return c;
		}else {
			return b;
		}
	}

	public static void main(String[] args) {
		//3����  int�� �μ� a,b,c���� �߰����� ���ϴ� med�޼ҵ带 �ۼ�.
		//int med(int a, int b, int c)
		
		Scanner input = new Scanner(System.in);
		System.out.println("���� a:"); int a = input.nextInt();
		System.out.println("���� b:"); int b = input.nextInt();
		System.out.println("���� c:"); int c = input.nextInt();
		
		System.out.println("�߰�����"+med3(a,b,c)+ "�Դϴ�.");
		input.close();
	}
}
