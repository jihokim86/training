package problem1_5;

import java.util.Scanner;

public class Square2 {

	public static void main(String[] args) {
		//1����n������ �������� �� ���� �����Ͽ� ǥ�� _���2
		Scanner input = new Scanner(System.in);
		System.out.print("������:");
		int n = input.nextInt();
		for(int i=1,j=1; i<=n ; i++,j=2){
			int k=i*j;
			System.out.println(k);
		}
//		for(int i=1, j=1 ; i<n ; i++, j=i*i)
//			System.out.println(i+"�� ������ "+j+" �Դϴ�.");
		input.close();
	}

}
