package problem1_6;

import java.util.Scanner;

public class FloatDoubleScanPrint {

	public static void main(String[] args) {
		//float �� ������ double �� ������ �Ǽ����� �о ǥ��
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("���� x�� float���Դϴ�. ���� y�� dobule���Դϴ�");
		System.out.println("x:");
		float x = input.nextFloat();
		System.out.println("y:");
		double y = input.nextDouble();
		
		System.out.println("x="+x);
		System.out.println("y="+y);
	input.close();
	}
}
