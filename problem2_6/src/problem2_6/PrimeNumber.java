package problem2_6;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		//���ڸ� �Է��ϸ� �Ҽ� ���� Ȯ��
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
				System.out.println(num+"�� �Ҽ��� �ƴմϴ�");
		}else {
				System.out.println(num+"�� �Ҽ��Դϴ�.");
		}
	}while(true);
  }
}

