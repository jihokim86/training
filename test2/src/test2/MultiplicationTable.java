package test2;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
		System.out.print("구구단 몇 단:");
		int a = input.nextInt();
		if(!(a ==0)||a ==1) {
			System.out.println(a+"단 출력");
			for(int j=1 ; j<=9 ;j++) {
				System.out.printf("%2d *%2d =  %2d\n",a,j,a*j);
			}
		}else {
			System.out.println("프로그램을 종료합니다");
			break;
		}
	 }
	input.close();
  }
}
