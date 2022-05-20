package problem1_10;

import java.util.Scanner;

public class SeasonString {

		static String seasonOf(int m) {
			
			switch(m) {
			case 3: case 4: case 5: return "��";
			case 6: case 7: case 8: return "����";
			case 9: case 10: case 11: return "����";
			case 12: case 1: case 2: return "�ܿ�";
			}
		
		return "";
		}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int month;
		do {
			System.out.print("�� ���Դϱ�(1~12):");
			month = input.nextInt();
		}while(month>12 && month<1);
		
		System.out.println("�ش� ���� ������ "+ seasonOf(month)+"�Դϴ�.");
	}
}
