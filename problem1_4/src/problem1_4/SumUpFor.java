package problem1_4;

import java.util.Scanner;

public class SumUpFor {
 public static void main(String[] args) {
	// ���� ���� ���� ī��Ʈ�ϴ� ������ For������ �ۼ��ض�
	 
		Scanner input = new Scanner(System.in);
		
		int a;
		int sum=0;
		do {
			System.out.println("1���� n������ ���� ���մϴ�");
			a=input.nextInt();
		}while(a<=0);
		
		for(int i=0; i<=a ; i++) {
			sum = sum +i;
		}
		
		System.out.println("1���� n������ �� :"+sum);
		input.close();
 }
}