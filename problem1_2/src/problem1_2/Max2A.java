package problem1_2;
import java.util.Scanner;
public class Max2A {

	public static void main(String[] args) {
		// ���� 2���� �Ǽ��� �߿��� ū ���� ǥ��(���1:if��)
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("�Ǽ� A�� �Է��ϼ���");
		double num1 = input1.nextDouble();
		System.out.println("�Ǽ� B�� �Է��ϼ���");
		double num2 = input1.nextDouble();
		
		if(num1>num2) {
			System.out.println("�Է��� ���� ū ���� �Ǽ� A="+num1+"�Դϴ�");
		}else if(num1<num2) {
			System.out.println("�Է��� ���� ū ���� �Ǽ� B="+num2+"�Դϴ�");
		}else {
			System.out.println("�Է��� ���� ũ�Ⱑ �����ϴ�.");
		}
		input1.close();
	}

}
