package problem2_1;

import java.util.Scanner;

public class engLowCapNumPrint {

	public static void main(String[] args) {
		// ���� �빮��/�ҹ��ڸ� ���� �� ���ڷ� ���
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("���� ��/�ҹ��ڸ� �Է��ϼ���! : ");
		char chr = input.next().charAt(0); 				//0��° �ε����� ���ڸ� ����
		int num = (int)chr;								//���ڸ� ��������ȯ
				
		System.out.printf("�Է��� ���ڴ� \"%c\"�̰� �ƽ�Ű�ڵ尪�� \"%d\" �̴�",chr,num);
		
		input.close();
	}
}
