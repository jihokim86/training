package problem1_5;

import java.util.Scanner;

public class Square1 {

	public static void main(String[] args) {
		//1���� n������ �������� �� ���� �����ؼ� ǥ���ϴ� ���α׷��� �ۼ�
		//���1
		
		Scanner input = new Scanner(System.in);
		int a;
		do {
			System.out.print("�������� �Է��ϼ���:");
			a = input.nextInt();
		}while(a<=0);
		
		for(int i=1 ; i<=a;i++) {
			System.out.println(i+"�� ������ "+i*i+" �Դϴ�");
		}
		input.close();
	}

}
