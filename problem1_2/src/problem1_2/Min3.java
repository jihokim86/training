package problem1_2;
import java.util.Scanner;

public class Min3 {

	public static void main(String[] args) {
		// 3���� ���� �� �ּҰ� ���ϱ�
		Scanner input = new Scanner(System.in);
		System.out.println("3���� ������ �Է��Ͻø� ���� �ּҰ��� ��µ˴ϴ�.");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int min;
		
		if(a>=b) {
			min=b;
		}else {
			min=a;
		}
		if(min>=c) {
			min=c;
		}
		System.out.println("�Է��� ������ �ּ� ���� "+min+" �Դϴ�.");
	input.close();
	}

}
