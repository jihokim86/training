package problem1_20;

public class StringTest {

	public static void main(String[] args) {
		//문자열과 null참조, 빈 문자열, 다른 String 형 변수가 참조하는 문자열을 참조
		String s1 = null; //참조하는 객체가 없다
		String s2 = ""; // ""을 찾모
		String s3 = "ABC";
		String s4 = "ABC";
		String s5 = "ABC";
		s5 = "XYZ";
		
		System.out.println(s1); //null
		System.out.println(s2); //
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5); // XYZ
		
		System.out.println(s3==s4); // true
		
		String a = "ABC";
		String b = "ABC"+a;
		String c = "ABC"+a;
		System.out.printf("%s   || %s \n",b,c); //ABCABC || ABCABC
		System.out.println(b==c); // false
		// 변수 b와 변수c는 개별적으로 만들어졌기에 참조객체가 다르다!!!??
	
	}

}
