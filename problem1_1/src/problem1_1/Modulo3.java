package problem1_1;

import java.util.Scanner;

public class Modulo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �Է��� �������� 3���� ������. �׸��� �� ����� ���� 
				// �� ���� 3�� ������ ���ϴ�. �� ���� 3���� ���� �������� 1�Դϴ�
				// �� ���� 3�� ���� �������� 2�Դϴ�.
				// ����� �ƴ� ���� �Է��߽��ϴ�.
				
				Scanner input = new Scanner(System.in);
				System.out.println("�������� �Է��ϼ���");
				int a = input.nextInt();
				if(a>0) {
				  if(a%3 == 0) {
					  System.out.println("�Է��� �� :"+ a);
					  System.out.println("3���� ������ ���ϴ�");
				  }else if(a%3 ==1) {
					  System.out.println("�Է��� �� :"+ a);
					  System.out.println("3���� ���� �������� 1�Դϴ�");
				  }else {
					  System.out.println("�Է��� �� :"+ a);
					  System.out.println("3���� ���� �������� 2�Դϴ�");
				  }
			    }else {
			    	  System.out.println("�Է��� �� :"+ a);
					  System.out.println("�Է��� ���� ����� �ƴմϴ�.");
			    }
				input.close();
	}

}
