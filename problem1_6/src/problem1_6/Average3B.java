package problem1_6;

import java.util.Scanner;

public class Average3B {

	public static void main(String[] args) {
		//세 정수의 평균값 구하기(캐스트 연산자 이용)
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("정수값 x,y,z의 평균을 구합니다");
		System.out.print("x값 : "); int x = input.nextInt();
		System.out.print("y값 : "); int y = input.nextInt();
		System.out.print("z값 : "); int z = input.nextInt();
		
		double ave = (double)(x+y+z)/3;
		System.out.printf("x,y,z의 평균은 %.3f입니다.\n",ave);
		input.close();
	}

}
