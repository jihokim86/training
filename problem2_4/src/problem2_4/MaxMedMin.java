package problem2_4;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMedMin {

	public static void main(String[] args) {
		//10개의 값 중 최대값, 최소값, 중간값을 구해서 출력
		
		Scanner input = new Scanner(System.in);
		
		int[] num = new int[10];
		
		for(int i=0; i<num.length; i++) {
			num[i] = input.nextInt();
		}
		
		Arrays.sort(num);
		
		System.out.println("최소값:"+num[0]);
		System.out.println("최대값:"+num[9]);
		System.out.println("중간값:"+((double)num[5]+num[4])/2);
		
	}

}
