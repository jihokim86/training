package problem1_2;

import java.util.Scanner;

public class Sort3 {

	public static void main(String[] args) {
// 3개의 정수 값을 오름차순(작은 순)으로 정렬하는 프로그램을 작성하라.
		Scanner input = new Scanner(System.in);
		System.out.println("3개의 정수를 입력하시면 오른차순으로 정렬합니다.");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		if(a>b) {
			int t=a; a=b; b=t;
		}
		if(b>c) {
			int t=b; b=c; c=t;
		}
		if(a>b) {
			int t=a; a=b; b=t;
		}
		System.out.printf("입력한 정수를 오름차순으로 정렬하였습니다.\n%d,%d,%d",a,b,c);
	input.close();
	}

}
