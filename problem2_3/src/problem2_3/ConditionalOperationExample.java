package problem2_3;

import java.util.Scanner;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		//���� �����ڸ� ����Ͽ� �ּҿ� �ִ밪 ���
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("x���� �Է��ϼ���"); int x = input.nextInt(); 
		System.out.print("y���� �Է��ϼ���"); int y = input.nextInt(); 
		System.out.print("z���� �Է��ϼ���"); int z = input.nextInt(); 
		
		int k = (x>y) ? ((x>z) ? x : z) : ((z>y) ? z :y);
		int h = (x<y) ? ((x<z) ? x : z) : ((z<y) ? z :y);
		
		System.out.println("�Է��� ���� �ִ밪�� : " + k + " �Դϴ�");
		System.out.println("�Է��� ���� �ִ밪�� : " + h + " �Դϴ�");
	}

}
