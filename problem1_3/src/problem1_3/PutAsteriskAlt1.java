package problem1_3;

import java.util.Scanner;

public class PutAsteriskAlt1 {

	public static void main(String[] args) {
//���� ���� ������ŭ * �� + �� ������ ���� ǥ���ϴ� ���α׷��� �ۼ�
//���������� �� �ٲ� ���ڸ� ����� ��
		Scanner input = new Scanner(System.in);
		int a ;
		do {
			System.out.print("��� ǥ���ұ��?:"); 
			a=input.nextInt();
		}while(a<1);
		
		for(int i=0; i< a;i++) {
			if(i%2==0) {
				System.out.print("+");
			}
			if(i%2==1) {
				System.out.print("*");
			}
		}
		input.close();
	}
}
