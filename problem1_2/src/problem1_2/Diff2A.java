package problem1_2;
import java.util.Scanner;

public class Diff2A {

	public static void main(String[] args) {
//���� �� �������� ���� ǥ��(if��)
		Scanner input = new Scanner(System.in);
		
		System.out.println("���� A���� �Է��ϼ���.");
		int a = input.nextInt();
		System.out.println("���� B���� �Է��ϼ���");
		int b = input.nextInt();
		
		if(a>=b) {
		System.out.println("�� ���� ���� "+(a-b)+"�Դϴ�.");
		}else {
		System.out.println("�� ���� ���� "+(b-a)+"�Դϴ�.");
		
	input.close();
	}
  }
}
