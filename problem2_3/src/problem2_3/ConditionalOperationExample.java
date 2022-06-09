package problem2_3;

import java.util.Scanner;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		//삼항 연산자를 사용하여 최소와 최대값 계산
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("x값을 입력하세요"); int x = input.nextInt(); 
		System.out.print("y값을 입력하세요"); int y = input.nextInt(); 
		System.out.print("z값을 입력하세요"); int z = input.nextInt(); 
		
		int k = (x>y) ? ((x>z) ? x : z) : ((z>y) ? z :y);
		int h = (x<y) ? ((x<z) ? x : z) : ((z<y) ? z :y);
		
		System.out.println("입력한 값중 최대값은 : " + k + " 입니다");
		System.out.println("입력한 값중 최대값은 : " + h + " 입니다");
	}

}
