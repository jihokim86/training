package problem1_4;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		 //���� ���� ���� �о 1���� n������ ���� ���ϴ� ���α׷��� �ۼ�
		 
		 Scanner input = new Scanner(System.in);
		 System.out.println("���� ���� a���� �о 1~a������ ���� ���Ѵ�");
		 System.out.println();
		 int a;
		 do {
		 System.out.print("���������� �Է��ϼ��� :");
		 	a = input.nextInt();
		 }while(a<=0);
		 
		 double b=1;
		 
		 for(int i=1;i<=a;i++) {
			 b=i*b;
		 }
		 System.out.println("1~a������ ���� :"+b);
		 input.close();
	 }

}