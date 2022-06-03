package problem1_20;

import java.util.Scanner;

public class SearchString {

	public static void main(String[] args) {
		//문자열 s1안에 문자열 s2가 포함되어있는지 확인하는 프로그램.
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("문자열 s1:"); String s1 = stdIn.next();
		System.out.print("문자열 s2:"); String s2 = stdIn.next();
		
		//s2에 s1가 포함되어 있는가?
		int idx = s1.indexOf(s2); //포함되어있지않으면 -1를 반환하고
		// 포함되어 있으면 그 위치를 반환한다.
		
		if(idx==-1) {
			System.out.println("포함되어 있지 않다");
		}else {
			System.out.println(s1);
			for(int i=0; i<idx; i++) {
				System.out.print(' ');
			}
			System.out.println(s2);
		}
	}

}
