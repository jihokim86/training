package problem1_4;

import java.util.Scanner;

public class PutAsterisk5A {
	public static void main(String[] args) {
		// ���� ������ŭ *�� ǥ���ϴ� ���α׷��� ����
		// 5�� ������ �ٹٲ��ؼ� ����ض�
		
		Scanner input = new Scanner(System.in);
		
		int a;
		do {
			System.out.print("��� *�� ǥ���ұ��? :");
			a = input.nextInt();
		}while(a<=0);
		
		for(int i=0; i<a; i++) {
			System.out.print("*");
			if(i%5==4) {
				System.out.println();
			}
		}
//		if(a%5 !=0) {
//			System.out.println();
//		}
		input.close();
	}
}