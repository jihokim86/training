package problem1_3;

import java.util.Scanner;

public class EnumScope {

	public static void main(String[] args) {
//2���� �������� �о �� ���� ���̿� �ִ� ��� �������� ���� �ͺ���
// ū ������ ǥ���ϴ� ���α׷��� �ۼ�����.
		Scanner input = new Scanner(System.in);
		
		System.out.println("�ΰ��� ������ �Է��ϸ� ������ ���� ���������� ����մϴ�.");
		int a= input.nextInt();
		int b= input.nextInt();
		if(a>b) {
			int t =a;
			a=b;
			b=t;
		}
		System.out.println("-----------");
		int k=a;
		for(int i=0; i<(b-k+1);i++) {
			System.out.print(a+",");
			a += 1;
			}
		input.close();
	}

}
