package problem1_10;

import java.util.Random;
import java.util.Scanner;

public class RandomTester {
	static int random(int min, int max) {
		if(max <= min) {
			return min;
		}else {
			Random num = new Random();
			return min+num.nextInt(max-min+1);
		}
	}

	public static void main(String[] args) {
		//난수를 생성해서 반환하는 random 매소드를 작성
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("난수를 생성합니다");
		System.out.print("하한값:"); int min = input.nextInt();
		System.out.print("상한값:"); int max = input.nextInt();
		
		System.out.println("생성한 난수는 "+ random(min,max) +"입니다");
		
	}

}
