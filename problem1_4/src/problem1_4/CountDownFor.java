package problem1_4;

import java.util.Scanner;

public class CountDownFor {
 public static void main(String[] args) {
	 // ���� ���� ���� ī��Ʈ�ϴ� ������ For������ �ۼ��ض�
	 
	 Scanner input = new Scanner(System.in);
	 
	 int a;
	 do {
		 System.out.println("�������� �Է��ϸ� 0���� ī��Ʈ�ٿ��մϴ�.");
		 a=input.nextInt();
	 }while(a<=0);
	 int x=a;
	 for(int i =0 ; i<x ; i++) {
		 
		 System.out.println(a);
		 a--;
	 }
	 input.close();
 }
}
