package problem1_1;

import java.util.Scanner;

public class Measure1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2���� ���� �������� �о, ���ڰ� ������ ����̸� "B�� A�� ����̴�"
				// ��� ǥ���ϰ� �׷��� ������ B�� A�� ����� �ƴϴ�"��� ���α׷��� �ۼ��Ͻÿ�
				
				
//				System.out.println("���A ,���B�� ���� �Է��ϼ���");
				Scanner input1 = new Scanner(System.in);
				
				System.out.println("��� A���� �Է��ϼ���");
				int num1 = input1.nextInt();
				System.out.println("��� B���� �Է��ϼ���");
				int num2 = input1.nextInt();
				
				
				int measure = num1%num2;
				
				if(measure==0) { //������������ != ����ϸ�ȴ�.
					System.out.println("B="+num2+"�� A="+num1+"�� ����̴�");
				}else {
					System.out.println("B="+num2+"�� A="+num1+"�� ����� �ƴϴ�");
				}
				
				
				input1.close();
	}

}
