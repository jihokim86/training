package problem1_1;

import java.util.Scanner;

public class Balance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2���� ���� a,b ���� �о a,b�� ��� ���踦 ������ ���� ǥ���ض�
				// a��ũ�� , b��ũ�� , a��b�� ����.
				
				Scanner input1 = new Scanner(System.in);
				
				System.out.println("a���� �Է��ϼ���");
				int a = input1.nextInt();
				System.out.println("b���� �Է��ϼ���");
				int b = input1.nextInt();
				
				if(a>b) {
					System.out.println("a�� ũ��");
				}else if(a<b) {
					System.out.println("b�� ũ��");
				}else {
					System.out.println("a��b�� ����");
				}
				input1.close();
	}

}
