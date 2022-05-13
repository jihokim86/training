package problem1_5;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		//양의 정수값을 읽어서 소수인지 판정하는 프로그램
		// 소수란 2이상 n미만인 수중 어떤 수로도 나누어지지 않는 정수값
		Scanner input = new Scanner(System.in);
		
		int a;
		
		do {
			System.out.print("2이상의 정수값:");
			a= input.nextInt();
		}while(a<2);
			
		for(int i=2; i<=a ; i++) {
			if(a==2 ||a%i !=0) {
				a=1;//소수임
			}else {
				a=0; //소수아님
			}
			if(a==1)
			System.out.println("소수입니다."); //1이면 소수
			if(a==0)
			System.out.println("소수가 아님"); //1이면 소수
		}
		input.close();
	}
}
