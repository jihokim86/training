package problem1_3;

import java.util.Scanner;

public class PutAsteriskAlt2 {

	public static void main(String[] args) {
// ���� ���� ��ŭ * �� +�� ����� ǥ�� (���2)
		Scanner input = new Scanner(System.in);
		System.out.println("�� ���� ǥ���ұ��");
		int a=input.nextInt();
		
		if(a>0) {
			int i=0;
			while(i<a/2) {
				System.out.print("*+");
				i++;
			}
			if(a%2==1) {
				System.out.print("*");
				System.out.println();
			}
		}
	input.close();
	}
}
