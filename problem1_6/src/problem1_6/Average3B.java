package problem1_6;

import java.util.Scanner;

public class Average3B {

	public static void main(String[] args) {
		//�� ������ ��հ� ���ϱ�(ĳ��Ʈ ������ �̿�)
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("������ x,y,z�� ����� ���մϴ�");
		System.out.print("x�� : "); int x = input.nextInt();
		System.out.print("y�� : "); int y = input.nextInt();
		System.out.print("z�� : "); int z = input.nextInt();
		
		double ave = (double)(x+y+z)/3;
		System.out.printf("x,y,z�� ����� %.3f�Դϴ�.\n",ave);
		input.close();
	}

}
