package problem1_2;
import java.util.Scanner;

public class Max2B {

	public static void main(String[] args) {
		//2���� �Ǽ� ���� �о ū ����  ǥ��(���2 : ���� ������, ���׿�����)
				Scanner input1 = new Scanner(System.in);
				
				System.out.println("�Ǽ� A�� �Է��ϼ���");
				double num1 = input1.nextDouble();
				System.out.println("�Ǽ� B�� �Է��ϼ���");
				double num2 = input1.nextDouble();
				
				//���׿����� ���ǽ� ? �� �Ǵ� ����� : �� �Ǵ� �����
				double a=(num1>num2) ? num1 :((num1<num2) ? num2 : 'a');
				if(a=='a') {
					System.out.println("�Է��� ���� �����ϴ�.");
				}else {
				System.out.println("�Է��� �� �� ū �Ǽ��� "+a+"�Դϴ�");
				}
				
				input1.close();
	}
}
