package problem2_4;

import java.util.Scanner;

public class EnumText {

	public static void main(String[] args) {
		//Enum ������ Ȱ���� ���
		
		Season season = null; //����Ÿ�� ���� ���� (����Ÿ�� ����)
		// (����Ÿ��+���� = ����Ÿ��.���Ż��)
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("���� ���� �Է��ϸ� ������ �˷��ֵ�������!:");
		int key = input.nextInt();
		
		switch (key) {
		case 3:case 4:case 5:
			System.out.println(Season.Spring);
			break;
		case 6:case 7:case 8:
			System.out.println(Season.Summer);
			break;
		case 9:case 10:case 11:
			System.out.println(Season.autumn);
			break;
		case 12:case 1:case 2:
		System.out.println(Season.winter);
		break;
		
		default:
			break;
		}
	}

}
