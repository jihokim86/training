package problem1_4;

import java.util.Scanner;

public class PutAsterisk5B {
	public static void main(String[] args) {
	// ���� ���� ��ŭ * ǥ��(5������ �ٹٲ�)(���2)
		Scanner input = new Scanner(System.in);
		
		int a;
		do {
			System.out.print("��� *�� ǥ���ұ��? :");
			a = input.nextInt();
		}while(a<=0);
		
		for(int i=0; i<a/5;i++) {  // a<5�̸� �н���
			System.out.println("*****");
		}
			int rest = a%5; // a=6 �Է½� rest=1
			if (rest>0) {
				for(int i =0 ; i<rest; i++) {
					System.out.print("*");
				}
					System.out.println();
			}
		input.close();
	}
}
