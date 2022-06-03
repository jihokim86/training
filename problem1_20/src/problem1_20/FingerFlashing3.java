package problem1_20;

import java.util.Scanner;

public class FingerFlashing3 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		HumanPlayer hp = new HumanPlayer();
		ComputerPlayer cp1 = new ComputerPlayer();
		ComputerPlayer cp2 = new ComputerPlayer();
		
		
		String[] hands = {"가위","바위","보"};
		int retry;
		
		
		do {
			//컴퓨터 손 생성
			int comp1 = cp1.nextHand(); //2
			int comp2 = cp2.nextHand();  //1
			
			//사람 손 생성
			int user = hp.nextHand(); //0
			
//			----//
			
			//양쪽의 손 표시
			System.out.println("컴퓨터1은"+hands[comp1]+"이고,"
					+"컴퓨터2는"+hands[comp2]+"이고,"
					+"당신은"+hands[user]+"입니다.");
			
			//판정 
			int r1 = (user - comp1 +3)%3; //(0-2)+3 = 1%3 =1 유저승리 (2-2)+3=3 %3 =0 //비겼다~~ (2-0)+3=5 %3 =2 컴퓨터 승리
			int r2 = (user - comp2 +3)%3;
			
			if(r1 == 2 && r2==2)
				System.out.println("당신의 승리");
			else if(r1==1 && r2==0)
				System.out.println("컴퓨터 1이 승리");
			else if(r1==0 && r2==1)
				System.out.println("컴퓨터 2가 승리");
			else if(r1 ==0 && r2 ==2)
				System.out.println("당신과 컴퓨터1이 승리");
			else if(r1 ==2 && r2 ==0)
				System.out.println("당신과 컴퓨터2이 승리");
			else if(r1 ==1 && r2 ==1)
				System.out.println("컴퓨터1과컴퓨터2이 승리");
			else
				System.out.println("비겼다.");
			
			do {
				System.out.print("다시한번?(0)아니오 (1)네");
				retry = stdIn.nextInt();
			}while(retry !=0 && retry !=1);
		}while(retry ==1);
	}
}
