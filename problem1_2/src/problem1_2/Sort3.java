package problem1_2;

import java.util.Scanner;

public class Sort3 {

	public static void main(String[] args) {
// 3���� ���� ���� ��������(���� ��)���� �����ϴ� ���α׷��� �ۼ��϶�.
		Scanner input = new Scanner(System.in);
		System.out.println("3���� ������ �Է��Ͻø� ������������ �����մϴ�.");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		if(a>b) {
			int t=a; a=b; b=t;
		}
		if(b>c) {
			int t=b; b=c; c=t;
		}
		if(a>b) {
			int t=a; a=b; b=t;
		}
		System.out.printf("�Է��� ������ ������������ �����Ͽ����ϴ�.\n%d,%d,%d",a,b,c);
	input.close();
	}

}
