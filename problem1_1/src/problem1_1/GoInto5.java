package problem1_1;

import java.util.Scanner;

public class GoInto5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �Է��� �������� 5�� ������ �������� "�� ���� 5�� ���������ϴ�."
				// �׷��� ������ 5�� ���������� �ʽ��ϴ�" ��� ǥ���ϼ���
				// ������ �Է��� ��쿡�� "������ �Է��߽��ϴ�"��� ǥ���Ұ�
				
				Scanner input = new Scanner(System.in);
				
				System.out.println("�������� �Է��ϼ���");
				int a = input.nextInt();
				
				if(a>0){
				  if(a%5==0){
					  System.out.println("�� ���� 5�� ���������ϴ�");
				  }else{
					  System.out.println("�� ���� 5�� ���������� �ʽ��ϴ�");
				  }
			     }else if(a==0){
					System.out.println("0�� ���� �� �����ϴ�.");
		         }else {
		        	 System.out.println("������ �Է��ϼ̽��ϴ�.");
		         }
				input.close();
	}

}
