package problem1_9;

import java.util.Random;
import java.util.Scanner;

public class DayCAI2 {

	public static void main(String[] args) {
		//한글 요일을 영어로 맞추는 학습 게임
		//재 입력 및 정답 보기 추가
		
		Random rand = new Random(); //난수 설정
		Scanner input = new Scanner(System.in);
		String[] dayKorean = {"일","월","화","수","목","금","토"};
		String[] dayEnglish = {"sunday","monday","tuesday","wednesday",
				"thursday","friday","saturday"};
		
		System.out.println("요일명을 영어 소문자로 입력하세요");
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
				System.out.print(dayKorean[day]+"요일:");
				String s = input.next();
				
				if(s.equals(dayEnglish[day])) {
					break;
				}
				System.out.println("틀렸습니다.");
				do {
					System.out.println("어떻게 할까요?1..재입력 / 0..정답보기");
					action = input.nextInt();
				}while(action!=0 && action !=1);
				if(action ==0) {
					System.out.println(dayKorean[day]+"요일은\""+dayEnglish[day]+"\"입니다.");
				}
			}while(action ==1);
			
			
			System.out.print("정답입니다. 다시한번? 1...Yes/0....No:");
			retry = input.nextInt();
		}while(retry==1);
	
		input.close();
	}
}
