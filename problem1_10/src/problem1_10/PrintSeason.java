package problem1_10;

import java.util.Scanner;

public class PrintSeason{
	static void printSeason(int m) {
	
	switch(m) {
	case 3:
	case 4:
	case 5:
		System.out.print("��");
		break;
	case 6:
	case 7:
	case 8:
		System.out.print("����");
		break;
	case 9:
	case 10:
	case 11:
		System.out.print("����");
		break;
	case 12:
	case 1:
	case 2:
		System.out.print("�ܿ�");
		break;
	}
}
	

	public static void main(String[] args) {
		//�μ� m�� ������ ���� ������ ǥ���ϴ� printSeason �ż��带 �ۼ�
		// m���� ���� ��(3,4,5) ����(6,7,8) ����(9,10,11) �ܿ�(12,1,2)
		// �� �̿��� ���� ���� �ƹ��͵� ǥ������ �ʴ´�.
		Scanner input = new Scanner(System.in);
		int month;
		do {
			System.out.print("��� �Դϱ�(1~12):");
			month = input.nextInt();
		}while(month <1 && month >12);
		
		System.out.print("�ش� ���� ������ ");
		printSeason(month);
		System.out.println("�Դϴ�.");
	}

}
