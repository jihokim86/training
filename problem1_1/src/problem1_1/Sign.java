package problem1_1;

import java.util.Scanner;

public class Sign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		���� ���� ���� ��ȣ�� �����ؼ� ǥ��
		Scanner input = new Scanner(System.in);
		System.out.println("������ �Է��� �ּ���");
		int num = input.nextInt();
		
		if(num>0) {
			System.out.println("������:"+num);
			System.out.println("�Էµ� ������ ����Դϴ�");
		}else if(num<0) {
			System.out.println("������:"+num);
			System.out.println("�Էµ� ������ �����Դϴ�");
		}else {
			System.out.println("������:"+num);
			System.out.println("�Էµ� ������ 0�Դϴ�");
		}
		input.close();
	}

}
