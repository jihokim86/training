package problem1_2;
import java.util.Scanner;

public class Diff2Digits1 {
	public static void main(String[] args) {
		// �� �������� ���� 10������ ��� " �� ���� ���� 10�����Դϴ�"
		// �׷��� ������ "�� ���� ���� 11�̻��Դϴ�" ��� (if�� ���)
				
				Scanner input1 = new Scanner(System.in);
				System.out.println("���� A���� �Է��ϼ���.");
				int a = input1.nextInt();
				System.out.println("���� B���� �Է��ϼ���");
				int b = input1.nextInt();
				int c = a-b;
						
				if(c>11) {
					System.out.println("�� ���� ���� 11�̻��Դϴ�.");
				}else {
					System.out.println("�� ���� ���� 10�����Դϴ�.");
				}
				input1.close();
			}
}
