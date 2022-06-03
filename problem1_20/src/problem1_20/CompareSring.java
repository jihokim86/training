package problem1_20;

import java.util.Scanner;

public class CompareSring {

	public static void main(String[] args) {
		//키보드에서 입력한 2개의 문자열이 같은지 판정하는 프로그램을 작성
		
		Scanner stdIn= new Scanner(System.in);
		
		System.out.print("문자열 s1:"); String s1 = stdIn.next();
		System.out.print("문자열 s2:"); String s2 = stdIn.next();
		
		if(s1 == s2) {
			System.out.println("s1과 s2 내용이 같습니다");
		}else {
			System.out.println("s1과 s2 내용이 다르다");
		}
		
		if(s1.equals(s2)) {
			System.out.println("s1과 s2 내용이 같습니다");
		}else {
			System.out.println("s1과 s2 내용이 다르다");
		}
	}

}
