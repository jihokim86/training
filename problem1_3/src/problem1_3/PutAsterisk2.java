package problem1_3;

import java.util.Scanner;

public class PutAsterisk2 {

	public static void main(String[] args) {
//�Է��� ���� ������ŭ *�� ǥ���ϴ� ���α׷��� �ۼ�.
//���������� �ٹٲ� ���ڸ� ����Ұ�. ���� ���� 1�̸��̸� �ٹٲ޹��ڸ� ǥ����������
		
		Scanner input = new Scanner(System.in);
		System.out.print("��� *�� ǥ���ұ��?:");
		int a = input.nextInt();
		if(a>0) {
			int i =0;
			while(i<a) {
				System.out.print("*");
				i++;
			}
		}
		System.out.println();
		input.close();
	}
}
