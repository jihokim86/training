package problem1_9;

import java.util.Random;
import java.util.Scanner;

public class DayCAI1 {

	public static void main(String[] args) {
		//요일을 표시하고 해당 요일의 영어 단어를 입력하는 영어 학습프로그램
		//요일은 난수를 사용해서 생성할 것
		//학습지가 원하는 만큼 반복할 것
		//동일 요일을 연속해서 표시하지 말것
		
		Random rand = new Random(); //난수 설정
		Scanner input = new Scanner(System.in);
		String[] dayKorean = {"일","월","화","수","목","금","토"};
		String[] dayEnglish = {"sunday","monday","tuesday","wednesday",
				"thursday","friday","saturday"};
		
		System.out.println("요일명을 영어 소문자로 입력하세요");
		int retry;
		int last=-1;
		do {
			int day;
			do {
				day = rand.nextInt(7);
			}while(day==last);
			last = day;
			
			while(true) {
				System.out.print(dayKorean[day]+"요일:");
				String s = input.next();
				
				if(s.equals(dayEnglish[day])) {
					break;
				}
				System.out.println("틀렸습니다.");
			}
			System.out.print("정답입니다. 다시한번? 1...Yes/0....No:");
			retry = input.nextInt();
		}while(retry==1);
	input.close();
	}//end of main
}//end of class



