package problem1_1;

import java.util.Scanner;

public class Nagative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ű����� �Է��� �������� ���̸� "�� ���� ���� ���Դϴ�." ��� ǥ���ϴ�
				// ���α׷��� �ۼ��Ͻÿ�.
				
				Scanner scan = new Scanner(System.in);
				
				System.out.print("�������� �Է��ϼ���!");
				
				int input = scan.nextInt();
				
				if(input>0) {
				System.out.println(input);
				}else {
					System.out.println("�� ���� ���� ���Դϴ�");
				}
				scan.close();
	}

}
