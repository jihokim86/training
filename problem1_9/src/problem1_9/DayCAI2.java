package problem1_9;

import java.util.Random;
import java.util.Scanner;

public class DayCAI2 {

	public static void main(String[] args) {
		//�ѱ� ������ ����� ���ߴ� �н� ����
		//�� �Է� �� ���� ���� �߰�
		
		Random rand = new Random(); //���� ����
		Scanner input = new Scanner(System.in);
		String[] dayKorean = {"��","��","ȭ","��","��","��","��"};
		String[] dayEnglish = {"sunday","monday","tuesday","wednesday",
				"thursday","friday","saturday"};
		
		System.out.println("���ϸ��� ���� �ҹ��ڷ� �Է��ϼ���");
		int retry;
		int last=-1;
		int action;
		do {
			int day;
			do {
				day = rand.nextInt(7);
			}while(day==last);
			last = day;
			
			do {
				System.out.print(dayKorean[day]+"����:");
				String s = input.next();
				
				if(s.equals(dayEnglish[day])) {
					break;
				}
				System.out.println("Ʋ�Ƚ��ϴ�.");
				do {
					System.out.println("��� �ұ��?1..���Է� / 0..���亸��");
					action = input.nextInt();
				}while(action!=0 && action !=1);
				if(action ==0) {
					System.out.println(dayKorean[day]+"������\""+dayEnglish[day]+"\"�Դϴ�.");
				}
			}while(action ==1);
			
			
			System.out.print("�����Դϴ�. �ٽ��ѹ�? 1...Yes/0....No:");
			retry = input.nextInt();
		}while(retry==1);
	
		input.close();
	}
}
