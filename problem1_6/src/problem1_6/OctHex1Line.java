package problem1_6;

import java.util.Scanner;

public class OctHex1Line {

	public static void main(String[] args) {
		//10������ �о 8����, 16������ ǥ��
		
		Scanner input = new Scanner(System.in);
		System.out.println("����:");
		int x = input.nextInt();
		
		System.out.printf("8������ %o�̰� 16������ %x�Դϴ�\n",x,x);
		input.close();
	}

}
