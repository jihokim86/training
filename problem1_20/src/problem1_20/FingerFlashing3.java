package problem1_20;

import java.util.Scanner;

public class FingerFlashing3 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		HumanPlayer hp = new HumanPlayer();
		ComputerPlayer cp1 = new ComputerPlayer();
		ComputerPlayer cp2 = new ComputerPlayer();
		
		
		String[] hands = {"����","����","��"};
		int retry;
		
		
		do {
			//��ǻ�� �� ����
			int comp1 = cp1.nextHand(); //2
			int comp2 = cp2.nextHand();  //1
			
			//��� �� ����
			int user = hp.nextHand(); //0
			
//			----//
			
			//������ �� ǥ��
			System.out.println("��ǻ��1��"+hands[comp1]+"�̰�,"
					+"��ǻ��2��"+hands[comp2]+"�̰�,"
					+"�����"+hands[user]+"�Դϴ�.");
			
			//���� 
			int r1 = (user - comp1 +3)%3; //(0-2)+3 = 1%3 =1 �����¸� (2-2)+3=3 %3 =0 //����~~ (2-0)+3=5 %3 =2 ��ǻ�� �¸�
			int r2 = (user - comp2 +3)%3;
			
			if(r1 == 2 && r2==2)
				System.out.println("����� �¸�");
			else if(r1==1 && r2==0)
				System.out.println("��ǻ�� 1�� �¸�");
			else if(r1==0 && r2==1)
				System.out.println("��ǻ�� 2�� �¸�");
			else if(r1 ==0 && r2 ==2)
				System.out.println("��Ű� ��ǻ��1�� �¸�");
			else if(r1 ==2 && r2 ==0)
				System.out.println("��Ű� ��ǻ��2�� �¸�");
			else if(r1 ==1 && r2 ==1)
				System.out.println("��ǻ��1����ǻ��2�� �¸�");
			else
				System.out.println("����.");
			
			do {
				System.out.print("�ٽ��ѹ�?(0)�ƴϿ� (1)��");
				retry = stdIn.nextInt();
			}while(retry !=0 && retry !=1);
		}while(retry ==1);
	}
}
