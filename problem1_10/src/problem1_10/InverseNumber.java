package problem1_10;

import java.util.Scanner;

public class InverseNumber {
	static Scanner stdIn = new Scanner(System.in);
	
	static int readPlusInt() {
		
		int x;
		do {
			System.out.println("양의 정수값:");
			x = stdIn.nextInt();
		}while(x<=0);
		return x;
	}

	public static void main(String[] args) {
		// 양의 정수값 이라는 메세지에 정수값을 입력하면 값을 거꾸로 반환하느 메서드 작성
		
		int x;
		
		do{
			int n = readPlusInt();
			
			System.out.print("반대로 읽으면  ");
			while(n>0) {
				System.out.print(n%10);
				n = n/10;
			}
			System.out.println("입니다");
		
			do {
				System.out.print("다시 한 번?<Yes..1 / No...0>:");
				x = stdIn.nextInt();
			}while(x !=0 && x!=1);
		
		}while(x ==1);
     }
   }
