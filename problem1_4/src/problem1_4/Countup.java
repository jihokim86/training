package problem1_4;

import java.util.Scanner;

public class Countup {

	public static void main(String[] args) {
		// ���� ���� ���� ī��Ʈ�ϴ� ������ For������ �ۼ��ض�
		 
		 Scanner input = new Scanner(System.in);
		 
		 int a;
		 do {
			 System.out.println("�������� 0���� �Է°����� ī��Ʈ���մϴ�.");
			 a=input.nextInt();
		 }while(a<=0);
		 
		 
		 for(int i =0 ; i<=a ; i++) {
			 
			 System.out.println(i);
			
		 }
		 input.close();

	}

}