package problem1_2;
import java.util.Scanner;

public class Diff2B {

	public static void main(String[] args) {
// ���� �� �������� ���� ǥ��(���ǿ�����,���׿�����)
		Scanner input = new Scanner(System.in);
		
		System.out.println("���� A���� �Է��ϼ���.");
		int a = input.nextInt();
		System.out.println("���� B���� �Է��ϼ���");
		int b = input.nextInt();
		
		int c = a>=b ? a-b : b-a;
		System.out.println("�� ���� ���� " + c +"�Դϴ�.");
	input.close();
		}
}
