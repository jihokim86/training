package problem2_6;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		//숫자를 입력하면 소수 여부 확인
		Scanner input = new Scanner(System.in);
		do {
		int num = input.nextInt();
		int cnt=0;
		
		for(int i=1; i<=num ; i++) {
			if(num%i == 0) {
				cnt++;
			}
		}
		if(cnt>2) {
				System.out.println(num+"은 소수가 아닙니다");
		}else {
				System.out.println(num+"은 소수입니다.");
		}
	}while(true);
  }
}

