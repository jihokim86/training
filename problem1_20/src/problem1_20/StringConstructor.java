package problem1_20;

import java.util.Scanner;

public class StringConstructor {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		char[] c= {'A','B','C','D','E','F','G','H','I','J'};
		
		String s1 = "ABC";
		String s2 = new String();
		String s3 = new String(c);
//		String s33= new String({'a','b','c'}); 형식상 오류일까?
		String s4 = new String(c,5,3);
		String s5 = new String("XYZ");//주소를 새로 만든다!
		String s55= "XYZ"; //위에 있는 것과 어떤 차이가 있을까?
		
		System.out.print("문자열:");
		String s6= stdIn.next();
		
		System.out.println(c); //s3과 같은 결과값이 나온다.
//		System.out.println(s2==c); 형식이 달라 비교 불가.
		System.out.println(s1); // ABC
		System.out.println(s2); //
		System.out.println(s3); //ABCDEFGHIJ
		System.out.println(s4); // FGH 5번초과 3개출력
		System.out.println(s5); // XYZ
		System.out.println(s55); //XYZ
		System.out.println(s5==s55); //false가 나오는거보니~ 주소가 다르네??
		System.out.println(s6);
	}

}
