package problem1_4;

import java.util.Scanner;

public class Measure {

	public static void main(String[] args) {
	// �Է��� �������� ��� ����� �� ������ ǥ���ض�
		Scanner input = new Scanner(System.in);
		
		int a;
		do {
			System.out.print("������ : ");
			a= input.nextInt();
		}while(a<=0);
		
		int k=0;
		for(int i=1; i <=a ; i++) {
			if(a% i ==0) {
				System.out.print(i+" ");
				k++;
			}
		}
		System.out.println();
		System.out.printf("%d�� ����� %d��",a,k);
		input.close();
		
	}

}