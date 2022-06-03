package problem1_20;

import java.util.Scanner;

public class StringCompareTo {

	public static void main(String[] args) {
		// 문자열 비교(대소관계)
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("문자열 s1:"); String s1 = stdIn.next();
		System.out.print("문자열 s2:"); String s2 = stdIn.next();
		
		//입력을 "ABC" 와 ABC 어떤 차이가 있나?
		
		int balance = s1.compareTo(s2);
		// 비교는 문자열의 내의 문자 유니코드를 사용한다.
		// 주어진 문자열s1이 문자열s2보다 사전적으로 앞에 있으면 음수를
		// 뒤에 있으면 양수를 반환한다.
		//문자열이 같을 경우 : 짧은 문자열이 사전적으로 앞에 있다고 판정, 길이의 차이를 반환
		//문자가 다른경우 :?? 이해안되네
		System.out.println(balance);
		if(balance<0) {
			System.out.println("s1이 작다");
		}else if(balance >0) {
			System.out.println("s2가 작다");
		}else {
			System.out.println("s1과 s2가 같다");
		}
	}
}
