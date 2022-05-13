package problem1_5;

import java.util.Scanner;

public class Square2 {

	public static void main(String[] args) {
		//1부터n까지의 정수값에 각 값을 제곱하여 표시 _방법2
		Scanner input = new Scanner(System.in);
		System.out.print("정수값:");
		int n = input.nextInt();
		for(int i=1,j=1; i<=n ; i++,j=2){
			int k=i*j;
			System.out.println(k);
		}
//		for(int i=1, j=1 ; i<n ; i++, j=i*i)
//			System.out.println(i+"의 제곱은 "+j+" 입니다.");
		input.close();
	}

}
