package problem1_3;

import java.util.Scanner;

public class CountDownPre {

	public static void main(String[] args) {
//����[4-5]���� x-- �� --x�� ��ġ�� ����� �ٲ�� �� ����
		
	Scanner input = new Scanner(System.in);
		
		System.out.println("�������� �Է��Ͻø� 0���� ī��Ʈ�ٿ� �մϴ�.");
		
		int x;
		do {
			System.out.println("���� ������");
			x=input.nextInt();
		}while(x<=0);
		
		while(x>=0) {
			System.out.println(--x);
			System.out.println("x�� ����"+x+"�� �ƽ��ϴ�.");
		}
	input.close();
	}

}
