package problem1_10;

import java.util.Random;
import java.util.Scanner;

public class MentalArithmetic {
	static Scanner stdIn = new Scanner(System.in);
	
	static boolean confirmRetry() {
		int cont;
		do {
			System.out.print("�ٽ� �� �� ?<yes..1/no..0>:");
			cont = stdIn.nextInt();
		}while(cont !=0 && cont !=1);
		return cont ==1;
	}

	public static void main(String[] args) {
		// ���� 4���� ��� ���� �� �ϳ��� �������� ����
		
		Random rand = new Random();
		System.out.println("�ϻ� �Ʒ�!");
		
		do {
			int x = rand.nextInt(900)+100;
			int y = rand.nextInt(900)+100;
			int z = rand.nextInt(900)+100;
			int pattern = rand.nextInt(4);
			
			int answer;
			switch(pattern) {
			case 0: answer = x+y+z; break;
			case 1: answer = x+y-z; break;
			case 2: answer = x-y+z; break;
			default: answer = x-y-z; break;
			}
			
			while(true) {
				System.out.print(x+((pattern<2)  ? " +" : " - ")+
						y+((pattern%2 ==0) ? "+" : " -")+
						z+"=");
				int k = stdIn.nextInt();
				if(k == answer) {
					
				}
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}
		}while(confirmRetry());
	}
}
