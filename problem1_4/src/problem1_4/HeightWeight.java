package problem1_4;

import java.util.Scanner;

public class HeightWeight {
 public static void main(String[] args) {
	 //���庰 ǥ�� ü�� ����ǥ�� ǥ���ϴ� ���α׷��� �ۼ�
	 // ǥ���� ������ ����(���۰�/���ᰪ/������)�� ������ �Է¹�����
	 // ǥ��ü��(����-100) x 0.9
	 
	 Scanner input = new Scanner(System.in);
	 System.out.print("�� cm���� :");
	 int a= input.nextInt();
	 System.out.print("�� cm���� :");
	 int b= input.nextInt();
	 System.out.print("�� cm ���� :");
	 int c= input.nextInt();
	 
	 System.out.println("--------------");
	 
	 for(int i =a; i<=b ; i=i+c)
	 System.out.println(i+" "+ (i-100)*0.9);
	 input.close();
 }
}