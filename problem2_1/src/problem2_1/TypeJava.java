package problem2_1;

public class TypeJava {

	public static void main(String[] args) {
		//java의 자료형을 선언하고 출력
		
		byte a = 3; 				//8 비트 정수 -128 ~ +127
		short b = 200;				//16비트 정수 -32,768 ~ +32,767
		int c = 1000000;			//32비트 정수 -2,147,483,638~+2,147,483,647
		long d = 1000000000L;		//64비트 정수	-9,223,372,036,854,775,808~+9,223,372,036,854,775,807
		float e = 3.14246484513f;	//32비트 부동소수점 -3.402932347e+38~+3.40292347e+38
		double f = 3.14246484513;	//64비트 부동소수점 -1.79769313486231570e+308~1.79769313486231570e+08
		char g = '가';				//16비트 유니코드  ‘\u0000’ ~ ‘\uFFFF’
		boolean h = true;			// true , false 
		
		System.out.println("java의 자료형을 선언하고 출력");
		System.out.println();
		System.out.println(a);
		System.out.println(b);
		System.out.println("intType : " +c);
		System.out.println("longType : "+d);
		System.out.println("floatType : "+e);
		System.out.println("doubleType : "+f);
		System.out.println("charType : " +g);
		System.out.println("blooleanType : "+ h);
		
	}

}
