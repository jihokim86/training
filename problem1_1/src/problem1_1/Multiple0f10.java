package problem1_1;

import java.util.Scanner;

public class Multiple0f10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Է��� �������� 10�� ����̸� �� ���� 10�� ����Դϴ�
				//�׷��� ������ 10�� ����� �ƴմϴ�
				//������ ���� ��� �����Դϴٶ�� ����ϱ�
				
				Scanner input = new Scanner(System.in);
				
				System.out.println("�������� �Է��ϼ���");
				
				int a = input.nextInt();
				int b=a%10;
				
				if(a>0) {
				  if (b == 0) {
					  System.out.println("�Է� �� :"+ a);
					  System.out.println("�� ���� 10�� ����Դϴ�.");
				  }else if(b != 0) {
					  System.out.println("�Է� �� :"+ a);
					  System.out.println("�� ���� 10�� ����� �ƴմϴ�.");
				  }
				}else if(a==0) {
					System.out.println("�Է� �� :"+ a);
					System.out.println("�� ���� 10���� �������� �����ϴ�.");
				}else {
					System.out.println("�Է� �� :"+ a);
				    System.out.println("������ �Է��ϼ̽��ϴ�.");
				}
				input.close();
	}

}
