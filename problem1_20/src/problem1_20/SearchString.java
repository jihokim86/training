package problem1_20;

import java.util.Scanner;

public class SearchString {

	public static void main(String[] args) {
		//���ڿ� s1�ȿ� ���ڿ� s2�� ���ԵǾ��ִ��� Ȯ���ϴ� ���α׷�.
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���ڿ� s1:"); String s1 = stdIn.next();
		System.out.print("���ڿ� s2:"); String s2 = stdIn.next();
		
		//s2�� s1�� ���ԵǾ� �ִ°�?
		int idx = s1.indexOf(s2); //���ԵǾ����������� -1�� ��ȯ�ϰ�
		// ���ԵǾ� ������ �� ��ġ�� ��ȯ�Ѵ�.
		
		if(idx==-1) {
			System.out.println("���ԵǾ� ���� �ʴ�");
		}else {
			System.out.println(s1);
			for(int i=0; i<idx; i++) {
				System.out.print(' ');
			}
			System.out.println(s2);
		}
	}

}
