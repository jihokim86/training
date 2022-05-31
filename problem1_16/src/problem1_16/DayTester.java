package problem1_16;

import java.util.Scanner;

public class DayTester {
	static Scanner stdIn = new Scanner(System.in);
	
	//--��¥ ���� ���� ǥ�� 
	
	static void display(Day day) {
		System.out.println(day+"�� ���� ����"); // ok
		System.out.println("����"+(day.isLeap() ? "�Դϴ�" : "�� �ƴմϴ�")); //ok
		System.out.println("���� �� ��� �ϼ�:"+day.dayOfYear());
//		System.out.println("���� �� �ܿ� �ϼ�:"+day.leftDayOfYear());
	}
	
	//--��¥ ����
	static void change(Day day) {
		System.out.println("[1]������ ���� [2]���� ����");
		System.out.println("[3]���� ���� [4]���� ����");
		System.out.println("[5]1�� �� [6]1�� ��");
		System.out.println("[7]n�� �� [8]n�� ��");
	}
	
	public static void main(String[] args) {
		System.out.println("��¥�� �Է��ϼ���");
		System.out.print("�� : "); int y = stdIn.nextInt();
		System.out.print("�� : "); int m = stdIn.nextInt();
		System.out.print("�� : "); int d = stdIn.nextInt();
		
		Day day = new Day(y,m,d);
		
		while(true) {
			System.out.print("[1]��¥ ���� ���� ǥ�� [2]��¥ ����	[3]�ٸ� ��¥�� ��\n"+"[4]���� ��¥ [5]����:");
		
			int menu = stdIn.nextInt();
			if(menu ==5) break;
			
			switch(menu) {
			case 1 : display(day); break;
//			case 2 : change(day); break;
//			case 3 : compare(day); break;
//			case 4 : beforeAfter(day); break;
			}
		
		}
	}
	
}
