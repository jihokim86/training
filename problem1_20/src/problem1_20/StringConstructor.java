package problem1_20;

import java.util.Scanner;

public class StringConstructor {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		char[] c= {'A','B','C','D','E','F','G','H','I','J'};
		
		String s1 = "ABC";
		String s2 = new String();
		String s3 = new String(c);
//		String s33= new String({'a','b','c'}); ���Ļ� �����ϱ�?
		String s4 = new String(c,5,3);
		String s5 = new String("XYZ");//�ּҸ� ���� �����!
		String s55= "XYZ"; //���� �ִ� �Ͱ� � ���̰� ������?
		
		System.out.print("���ڿ�:");
		String s6= stdIn.next();
		
		System.out.println(c); //s3�� ���� ������� ���´�.
//		System.out.println(s2==c); ������ �޶� �� �Ұ�.
		System.out.println(s1); // ABC
		System.out.println(s2); //
		System.out.println(s3); //ABCDEFGHIJ
		System.out.println(s4); // FGH 5���ʰ� 3�����
		System.out.println(s5); // XYZ
		System.out.println(s55); //XYZ
		System.out.println(s5==s55); //false�� �����°ź���~ �ּҰ� �ٸ���??
		System.out.println(s6);
	}

}
