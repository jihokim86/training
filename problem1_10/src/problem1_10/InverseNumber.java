package problem1_10;

import java.util.Scanner;

public class InverseNumber {
	static Scanner stdIn = new Scanner(System.in);
	
	static int readPlusInt() {
		
		int x;
		do {
			System.out.println("���� ������:");
			x = stdIn.nextInt();
		}while(x<=0);
		return x;
	}

	public static void main(String[] args) {
		// ���� ������ �̶�� �޼����� �������� �Է��ϸ� ���� �Ųٷ� ��ȯ�ϴ� �޼��� �ۼ�
		
		int x;
		
		do{
			int n = readPlusInt();
			
			System.out.print("�ݴ�� ������  ");
			while(n>0) {
				System.out.print(n%10);
				n = n/10;
			}
			System.out.println("�Դϴ�");
		
			do {
				System.out.print("�ٽ� �� ��?<Yes..1 / No...0>:");
				x = stdIn.nextInt();
			}while(x !=0 && x!=1);
		
		}while(x ==1);
     }
   }
