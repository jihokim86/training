package problem1_1;

import java.util.Scanner;

public class Absolute1 {
	public static void main(String[] args) {
		//�������� �о ���� ������ ǥ��
		do {
		try {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("�Է��� �������� ���밪�� ���մϴ�. ������ �Է����ּ���");
			
			int input = scan.nextInt();
			
			if(input<=0) {
				System.out.println("�Է��Ͻ� ��"+input+"�� ���밪��"+-input+"�Դϴ�");
			}else {
				System.out.println("�Է��Ͻ� ��"+input+"�� ���밪��"+input+"�Դϴ�");
			}
		scan.close();
			
		} catch (Exception e) {
			System.out.println("������ �Է��ϼ���");
		}
		}while(true);
}}