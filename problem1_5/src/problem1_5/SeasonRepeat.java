package problem1_5;

import java.util.Scanner;

public class SeasonRepeat {

	public static void main(String[] args) {
		// ���� ���������� �о �ش��ϴ� ���� ������ ǥ���ϴ� ���α׷��� �ۼ�
		// ���ϴ� ��ŭ �Է� �� ����Ҽ��ְ��ϸ�, 1~12�̿��� ���� �Էµ� ��� ���Է�
		// ���� do��
		Scanner input = new Scanner(System.in);
			System.out.println("������ ã���ϴ�.");
		int a,b;
		
		do {
			do {
			System.out.println("�� ���Դϱ�?:");
			a= input.nextInt();
			}while(a<=0 || a>12);
			
			if(a>=3 && a<=5) {
				System.out.println("��");
			}
			if(a>=6 && a<=8) {
				System.out.println("����");
			}
			if(a>=9 && a<=11) {
				System.out.println("����");
			}
			if(a==1 || a==2 || a==12) {
				System.out.println("�ܿ�");
			}
			
			System.out.println("�ٽ� �ϰڽ��ϱ�? 1.Yes / 0.NO");
			 b = input.nextInt();
		}while(b==1);
		System.out.println("����");
		input.close();
	}
}
