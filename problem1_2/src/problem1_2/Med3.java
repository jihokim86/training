package problem1_2;
import java.util.Scanner;

public class Med3 {

	public static void main(String[] args) {
//�Է¹��� 3���� ���� �� �� �߾Ӱ��� ���ؼ� ǥ��
		Scanner input = new Scanner(System.in);
		System.out.println("3���� ������ �Է��Ͻø� ���� �߾Ӱ��� ��µ˴ϴ�.");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int med=0;
		
		if(a>=b && a<=c) {
			med=a;		
		}
		if(b>=a && b<=c) {
			med=b;
		}
		if(c>=a && c<=b) {
			med=c;
		}
		if(a<=b && a>=c) {
			med=a;		
		}
		if(b<=a && b>=c) {
			med=b;
		}
		if(c<=a && c>=b) {
			med=c;
		}
		
		System.out.println("�Է��� ���� �� �� �߾Ӱ��� "+ med+ " �Դϴ�.");
	input.close();
	}
}
