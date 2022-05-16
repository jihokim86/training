package problem1_6;

import java.util.Random;
import java.util.Scanner;

public class FindNumber {

	public static void main(String[] args) {
		// 숫자 맞추기 게임(0~99)
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		
		final int MAX_NO = 6; // 최대 입력 횟수
		int leftNo = MAX_NO;  // 남은 횟수
		int no = rand.nextInt(100); // 맞춰야 하는 숫자 : 0~99난수
		
		System.out.println("숫자 맞추기 게임 시작");
		System.out.println("0~99사이의 숫자를 맞추세요");
		
		int x;
		do {
			System.out.println("남은 횟수" + (leftNo--)+"회,어떤 숫자일까?");
			x=input.nextInt();
			
			if(x>no) {
				System.out.println("더 작은 숫자입니다.");
			}else if(x<no) {
				System.out.println("더 큰 숫자입니다");
			}
		}while(x != no && leftNo>0);
		
		if(x==no) {
			System.out.println((MAX_NO-leftNo)+"회만에 마주었습니다.");
		}else {
			System.out.println("아쉽네요. 정답은 "+no+"입니다");
		}
		input.close();
	}

}
