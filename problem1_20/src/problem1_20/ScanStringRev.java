package problem1_20;

import java.util.Scanner;

public class ScanStringRev {

	public static void main(String[] args) {
		//���ڿ��� �о �� ���ڿ��� �������� ǥ���ϴ� ���α׷��� �ۼ�
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���ڿ�:");
		String s = stdIn.next();
		
		for(int i = s.length()-1; i>=0;i--) {
			System.out.printf("%s",s.charAt(i));
			//charAt()�� ����� ����? ���ڿ����� ���ڸ� Ȯ���Ѵ�.			
			//��ȯ���� char ���̴�.
		}
		System.out.println();
		System.out.printf("%s  || %s\n",'a',"aa");
		//%s�� 'a'�� ������ �ֳ�???
	}

}
