package problem1_3;

import java.util.Scanner;

public class SignRepeat {

	public static void main(String[] args) {
	// ���� ���� ���� ��ȣ�� �����ؼ� ǥ��(���ϴ� ��ŭ �ݺ�)
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("������ �Է��Ͻø� ��ȣ�� �����մϴ�.");
			int a = input.nextInt();
			if(a>0) {
				System.out.println("�Է��� ���� ��� �Դϴ�.");
				}else if(a<0) {
				System.out.println("�Է��� ���� ���� �Դϴ�.");
			    }else {
			    System.out.println("0�� �Է��ϼ̽��ϴ�.");
                }
			System.out.println();
			System.out.println("��� �����Ϸ��� 1, �׸��η��� 0�� �Է��ϼ���");
			int b = input.nextInt();
			if(b==0) {
				break;
			}
		}
		input.close();
    }
}

