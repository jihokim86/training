package problem1_4;

import java.util.Scanner;

public class Countup {

	public static void main(String[] args) {
		// 양의 정수 값을 카운트하는 문제를 For문으로 작성해라
		 
		 Scanner input = new Scanner(System.in);
		 
		 int a;
		 do {
			 System.out.println("정수값을 0부터 입력값까지 카운트업합니다.");
			 a=input.nextInt();
		 }while(a<=0);
		 
		 
		 for(int i =0 ; i<=a ; i++) {
			 
			 System.out.println(i);
			
		 }
		 input.close();

	}

}
