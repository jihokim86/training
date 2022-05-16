package problem1_6;

import java.util.Scanner;

public class SumGroup2 {

	public static void main(String[] args) {
		// 정수값을 그룹별로 읽어서 합산(정수5 x 10그룹)
		Scanner input = new Scanner(System.in);
		
		System.out.println("정수를 더합니다.");
		int total = 0;
		
		Outer:
			for(int i=1;i<=10;i++) {
				System.out.println(i+"그룹");
				
				for(int j=0 ;j<5;j++) {
					System.out.println("정수:");
					int t = input.nextInt();
					if(t==99999){
						break Outer;
					}else if(t==88888) {
						continue Outer;
					}
					total += t;
				}
			}
		System.out.println("\n합계는 "+ total + "입니다");
	}
}
