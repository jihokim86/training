package problem1_4;

import java.util.Scanner;

public class SumupForExp {

	public static void main(String[] args) {
// n������ ���� ���ϴ� ���α׷��� ���ؼ� ���ı��� ǥ���ϴ� ���α׷��� �ۼ�
		Scanner input = new Scanner(System.in);
		
		int a;
		do {
			System.out.println("1���� n������ ���� ���մϴ�");
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