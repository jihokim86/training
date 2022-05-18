package problem1_8;

import java.util.Scanner;

public class PointSumAve {

	public static void main(String[] args) {
		//시험 점수의 합계,평균,최고점,최저점을 구하는 프로그램
		//사람 수와 점수는 키보드를 통해 입력 받을 것.
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("사람 수:");
		int a = input.nextInt();
		int[] scores = new int[a];
		System.out.println("점수를 입력하세요");
		int sum=0;
		
		
		for(int i=0; i<scores.length;i++) {
			System.out.print((i+1)+"번의 점수: ");
			scores[i] = input.nextInt();
			sum += scores[i];
		}
		
		int max = scores[0];
		int min = scores[0];
		for(int i=0; i<scores.length;i++) {
			if(max>scores[i]) {
				max=scores[i];
			}
			if(min<scores[i]) {
				min=scores[i];
			}
		}
		System.out.println("합계는"+sum+"점입니다");
		System.out.println("평균은"+(double)sum/a+"점입니다");
		System.out.println("평균은"+(double)sum/a+"점입니다");
		System.out.println("최고점은"+max+"점입니다");
		System.out.println("최저점은"+min+"점입니다");
	}

}
