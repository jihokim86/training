package problem1_4;

import java.util.Scanner;

public class PutAsteriskFor {
	public static void main(String[] args) {
//기호문자를 임의의 개수만큼 풀력했던 문제를 for문으로 작성해라.
		Scanner input = new Scanner(System.in);
		
		int a;
		do {
			System.out.print("몇개의 * 를 표시할까요? : ");
			a = input.nextInt();
			if(a<0) {
				System.out.println("양의정수를 다시 입력하세요");
				System.out.println();
			}
		}while(a<0);
		
		int i=0;
		while(a>i) {
			System.out.print("*");
			i++;
		}
		System.out.println();
		for(int j=0; j<a;j++) {
			System.out.print("*");
		}
		input.close();
		}
	}

