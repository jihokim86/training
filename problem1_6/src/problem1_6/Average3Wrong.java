package problem1_6;

import java.util.Scanner;

public class Average3Wrong {

	public static void main(String[] args) {
		// 3������������ �о ����� �Ǽ��� ǥ��
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("������ x,y,z�� ����� ���մϴ�");
		System.out.print("x�� : "); int x = input.nextInt();
		System.out.print("y�� : "); int y = input.nextInt();
		System.out.print("z�� : "); int z = input.nextInt();
		
		double ave = (x+y+z)/3;
		System.out.printf("x,y,z�� ����� %.3f�Դϴ�.\n",ave);
		input.close();
	}

}
