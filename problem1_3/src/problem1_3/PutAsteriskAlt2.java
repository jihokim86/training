package problem1_3;

import java.util.Scanner;

public class PutAsteriskAlt2 {

	public static void main(String[] args) {
// 읽은 갯수 만큼 * 와 +를 교대로 표시 (방법2)
		Scanner input = new Scanner(System.in);
		System.out.println("몇 개를 표시할까요");
		int a=input.nextInt();
		
		if(a>0) {
			int i=0;
			while(i<a/2) {
				System.out.print("*+");
				i++;
			}
			if(a%2==1) {
				System.out.print("*");
				System.out.println();
			}
		}
	input.close();
	}
}
