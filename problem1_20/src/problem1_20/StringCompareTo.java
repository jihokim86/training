package problem1_20;

import java.util.Scanner;

public class StringCompareTo {

	public static void main(String[] args) {
		// ���ڿ� ��(��Ұ���)
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���ڿ� s1:"); String s1 = stdIn.next();
		System.out.print("���ڿ� s2:"); String s2 = stdIn.next();
		
		//�Է��� "ABC" �� ABC � ���̰� �ֳ�?
		
		int balance = s1.compareTo(s2);
		// �񱳴� ���ڿ��� ���� ���� �����ڵ带 ����Ѵ�.
		// �־��� ���ڿ�s1�� ���ڿ�s2���� ���������� �տ� ������ ������
		// �ڿ� ������ ����� ��ȯ�Ѵ�.
		//���ڿ��� ���� ��� : ª�� ���ڿ��� ���������� �տ� �ִٰ� ����, ������ ���̸� ��ȯ
		//���ڰ� �ٸ���� :?? ���ؾȵǳ�
		System.out.println(balance);
		if(balance<0) {
			System.out.println("s1�� �۴�");
		}else if(balance >0) {
			System.out.println("s2�� �۴�");
		}else {
			System.out.println("s1�� s2�� ����");
		}
	}
}
