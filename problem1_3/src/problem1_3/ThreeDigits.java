package problem1_3;

import java.util.Scanner;

public class ThreeDigits {

	public static void main(String[] args) {
//3�ڸ��� ���� ������(100~999)�� �д� ���α׷��� �ۼ��ض�
// �Է��� ���� 3�ڸ� ���� ������ �ƴϸ�ٽ� �Է��ϰ� �ض�
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
		System.out.println("3�ڸ� ���� ���� ���� �Է��ϼ���");
		
		int num= input.nextInt();
		
		if(num>=100 && num<1000) {
			System.out.println("�Է��� ���� "+num+"���� ���ڸ� �������� �Դϴ�.");
			System.out.println("���α׷��� �����մϴ�!!");
			break;
		}else {
			System.out.println("���ڸ��� ���������� �ƴմϴ�.");
			System.out.println();
		}
      }
		input.close();
	}
}

