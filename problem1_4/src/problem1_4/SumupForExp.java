package problem1_4;

import java.util.Scanner;

public class SumupForExp {

	public static void main(String[] args) {
// n까지의 합을 구하는 프로그램에 대해서 계산식까지 표시하는 프로그램을 작성
		Scanner input = new Scanner(System.in);
		
		int a;
		do {
			System.out.println("1부터 n까지의 합을 구합니다");
			a=input.nextInt();
		}while(a<=0);
		
		int sum=0;
		for(int i=1; i<a ; i++) {
			System.out.print(i+"+");
			sum = sum + i;
			}
		sum = sum +a;
		System.out.println(a+"="+ sum);
		input.close();
	}

}
