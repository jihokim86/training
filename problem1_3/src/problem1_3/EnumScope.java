package problem1_3;

import java.util.Scanner;

public class EnumScope {

	public static void main(String[] args) {
//2개의 정수값을 읽어서 두 정수 사이에 있는 모든 정수값을 작은 것부터
// 큰 순으로 표시하는 프로그램을 작성하자.
		Scanner input = new Scanner(System.in);
		
		System.out.println("두개의 정수를 입력하면 사이의 값을 순차적으로 출력합니다.");
		int a= input.nextInt();
		int b= input.nextInt();
		if(a>b) {
			int t =a;
			a=b;
			b=t;
		}
		System.out.println("-----------");
		int k=a;
		for(int i=0; i<(b-k+1);i++) {
			System.out.print(a+",");
			a += 1;
			}
		input.close();
	}

}
