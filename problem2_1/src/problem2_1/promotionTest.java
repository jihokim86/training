package problem2_1;

public class promotionTest {
	
	public static void main(String[] args) {
	// 강제형 변환 4가지를 만들고 출력
	// byte < short < int < long < float < double
	
	long a = 127;
	int b = (int)a; 				// long 타입 -> int 타입
	short c = (short)a;				// long 타입 -> short타입
	byte d = (byte)a;				// long 타입 -> byte 타입
	String str = "127";		
	int e = Integer.parseInt(str);	// String 타입 -> int 타입 (숫자만 가능)
	
	System.out.println("long type : " + a);
	System.out.println("long -> int  : " + b);
	System.out.println("long -> short : " + c);
	System.out.println("long -> byte : " + d);
	System.out.println("String -> int : " + e);
	}
}
