package problem1_6;

import java.util.Scanner;

public class FloatDoubleScanPrint {

	public static void main(String[] args) {
		//float 형 변수와 double 형 변수에 실수값을 읽어서 표시
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("변수 x는 float형입니다. 변수 y는 dobule형입니다");
		System.out.println("x:");
		float x = input.nextFloat();
		System.out.println("y:");
		double y = input.nextDouble();
		
		System.out.println("x="+x);
		System.out.println("y="+y);
	input.close();
	}
}
