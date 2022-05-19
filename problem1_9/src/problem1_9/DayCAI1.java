package problem1_9;

import java.util.Random;
import java.util.Scanner;

public class DayCAI1 {

	public static void main(String[] args) {
		//������ ǥ���ϰ� �ش� ������ ���� �ܾ �Է��ϴ� ���� �н����α׷�
		//������ ������ ����ؼ� ������ ��
		//�н����� ���ϴ� ��ŭ �ݺ��� ��
		//���� ������ �����ؼ� ǥ������ ����
		
		Random rand = new Random(); //���� ����
		Scanner input = new Scanner(System.in);
		String[] dayKorean = {"��","��","ȭ","��","��","��","��"};
		String[] dayEnglish = {"sunday","monday","tuesday","wednesday",
				"thursday","friday","saturday"};
		
		System.out.println("���ϸ��� ���� �ҹ��ڷ� �Է��ϼ���");
		int retry;
		int last=-1;
		do {
			int day;
			do {
				day = rand.nextInt(7);
			}while(day==last);
			last = day;
			
			while(true) {
				System.out.print(dayKorean[day]+"����:");
				String s = input.next();
				
				if(s.equals(dayEnglish[day])) {
					break;
				}
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}
			System.out.print("�����Դϴ�. �ٽ��ѹ�? 1...Yes/0....No:");
			retry = input.nextInt();
		}while(retry==1);
	input.close();
	}//end of main
}//end of class



