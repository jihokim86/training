package problem1_20;

import java.util.Scanner;

public class ScanStringRev {

	public static void main(String[] args) {
		//문자열을 읽어서 그 문자열을 역순으로 표시하는 프로그램을 작성
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("문자열:");
		String s = stdIn.next();
		
		for(int i = s.length()-1; i>=0;i--) {
			System.out.printf("%s",s.charAt(i));
			//charAt()의 기능이 뭘까? 문자열안의 문자를 확인한다.			
			//반환값은 char 형이다.
		}
		System.out.println();
		System.out.printf("%s  || %s\n",'a',"aa");
		//%s는 'a'를 받을수 있네???
	}

}
