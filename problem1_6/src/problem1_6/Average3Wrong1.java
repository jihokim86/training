package problem1_6;

import java.util.Scanner;

public class Average3Wrong1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("정수값 x,y,z의 평균을 구합니다");
		System.out.print("x값 : "); int x = input.nextInt();
		System.out.print("y값 : "); int y = input.nextInt();
		System.out.print("z값 : "); int z = input.nextInt();
		
		double ave = (x+y+z)/3.0;
		System.out.printf("x,y,z의 평균은 %.3f입니다.\n",ave);
		input.close();
	}

}
