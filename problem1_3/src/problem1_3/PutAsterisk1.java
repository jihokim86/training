package problem1_3;

import java.util.Scanner;

public class PutAsterisk1 {

	public static void main(String[] args) {
// �Է��� ���� ������ŭ "*"�� ǥ���ϴ� ���α׷��� �ۼ��ض�
// ���������� �� �ٲ� ���ڸ� ����Ұ�. �� ���� ���� 1�̸��̸� �ٹٲ� ���ڸ� ǥ���ؼ��� �ȵȴ�.
	Scanner input = new Scanner(System.in);
	
	int a;
	do {
	System.out.print("��� * �� ǥ���ұ��? : ");
	a = input.nextInt();
	}while(a<1);
		
	for(int i=0; i<a ; i++) {
		System.out.print("*");
	}
	input.close();
  }
}
