package problem1_2;
import java.util.Scanner;

public class Diff2Digits2 {

	public static void main(String[] args) {
// ���� �� ���� ���� 11�̻������� ǥ��(���2:���ǿ��깮 ���׿�����)
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("A���� �Է��ϼ���");
		int a= input.nextInt();
		System.out.println("B���� �Է��ϼ���");
		int b= input.nextInt();
		int c = (a-b)>=11 ? 1 : 2 ;
		
		switch(c){
		case 1:
			System.out.println("�� ���� ���̴� 11�̻��Դϴ�.");
			break;
		case 2:
			System.out.println("�� ���� ���̴� 11�̸��Դϴ�.");
			break;
		}
	input.close();
	}
}
