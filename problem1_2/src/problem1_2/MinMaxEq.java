package problem1_2;
import java.util.Scanner;

public class MinMaxEq {

	public static void main(String[] args) {
// �Է¹��� 2���� ���� ���� ���� ���� ū ���� ǥ��. ������ ���ٰ� ǥ��
		Scanner input = new Scanner(System.in);
		
		System.out.println("���� 2���� �Է��ϼ���.");
		int a = input.nextInt();
		int b = input.nextInt();
		
		if(a>b) {
			System.out.println("�Է°� �� ū ����"+a+"�̰�, ���� ���� "+b+" �Դϴ�.");
		}else if(b>a) {
			System.out.println("�Է°� �� ū ����"+b+"�̰�, ���� ���� "+a+" �Դϴ�.");
		}else {
			System.out.println("�Է��� �� ���� �����ϴ�.");
		}
		input.close();
	}

}
