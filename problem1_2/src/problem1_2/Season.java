package problem1_2;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
//���� 1~12 ���������� �о �ش��ϴ� ������ ǥ���ϴ� ���α׷�
		Scanner input = new Scanner(System.in);
		System.out.println("�� ���Դϱ�?");
		int a=input.nextInt();
		
		switch(a) {
		case 1:
		System.out.println("��");break;
		case 2:
		System.out.println("��");break;
		case 3:
		System.out.println("��");break;
		case 4:
		System.out.println("����");break;
		case 5:
		System.out.println("����");break;
		case 6:
		System.out.println("����");break;
		case 7:
		System.out.println("����");break;
		case 8:
		System.out.println("����");break;
		case 9:
		System.out.println("����");break;
		case 10:
		System.out.println("�ܿ�");break;
		case 11:
		System.out.println("�ܿ�");break;
		case 12:
		System.out.println("�ܿ�");break;
		default:
		System.out.println("�׷� ���� �����ϴ�.");break;
		}
		input.close();
	}

}
