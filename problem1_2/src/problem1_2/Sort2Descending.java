package problem1_2;

import java.util.Scanner;

public class Sort2Descending {

	public static void main(String[] args) {
//2개의 정수 값을 내림차순(큰순)으로 정렬하는 프로그램을 작성
		Scanner input = new Scanner(System.in);
		System.out.println("정수 2개를 입력하시면 내림차순으로 정렬합니다.");
		int a = input.nextInt();
		int b = input.nextInt();
		
		if(a<b) {
			int t=a;
			a=b;
			b=t;
		}
		System.out.printf("입력한 정수를 내림차순으로 정렬합니다.\n%d,%d",a,b);
	input.close();
	}

}
