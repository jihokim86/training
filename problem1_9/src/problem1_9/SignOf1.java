package problem1_9;

import java.util.Scanner;

public class SignOf1 {
	
	static int signOf(int n) {
		int sign =0 ;
		if(n>0) {
			sign = 1;
		}else if(n<0){
			sign = -1;
		}
		return sign;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���� x :");
		int n = input.nextInt();
		int s = signOf(n);
		System.out.println("singOf(x)��"+s+"�Դϴ�.");
		input.close();
	}
}
