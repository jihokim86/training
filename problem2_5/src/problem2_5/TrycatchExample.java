package problem2_5;

import java.util.Scanner;

public class TrycatchExample {

	public static void main(String[] args) {
		//���ڸ� �Է����� ������ Exception�� �߻��ϵ��� �Ͻÿ�
		try {
			Scanner input = new Scanner(System.in);
			System.out.println("���ڸ� �Է���");
			int num = input.nextInt();
			System.out.printf("�Է��� ���ڴ� %s�Դϴ�",num);
			
		} catch (Exception e) {
			System.out.println("���ڸ� �Է� �����մϴ�.");
		}
	}
}
