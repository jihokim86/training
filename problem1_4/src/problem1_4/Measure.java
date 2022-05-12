package problem1_4;

import java.util.Scanner;

public class Measure {

	public static void main(String[] args) {
	// 입력한 정수값의 모든 약수와 그 개수를 표시해라
		Scanner input = new Scanner(System.in);
		
		int a;
		do {
			System.out.print("정수값 : ");
			a= input.nextInt();
		}while(a<=0);
		
		int k=0;
		for(int i=1; i <=a ; i++) {
			if(a% i ==0) {
				System.out.print(i+" ");
				k++;
			}
		}
		System.out.println();
		System.out.printf("%d의 약수는 %d개",a,k);
		input.close();
		
	}

}
