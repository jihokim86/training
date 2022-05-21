package problem1_10;

import java.util.Scanner;

public class Rotate {
	
	static void printBits(int x) {
		for(int i=31;i>=0;i--) {
			System.out.print(((x>>>i&1)==1)?'1':'0');
		}
	}
	
	static int rRotate(int x,int n) {
		if(n<0) return lRotate(x,-n);
		n%=32;
		return (n==0 ? x: (x>>>n) | (x<<(32-n)));
	}
	
	static int lRotate(int x, int n) {
		if(n<0) return rRotate(x,-n);
		n%=32;
		return (n==0 ? x: (x<<n) | (x>>>(32-n)));
	}

	public static void main(String[] args) {
		// ����x�� ���������� n��Ʈ ȸ���� ���� ��ȯ�ϴ� rRotate�޼ҵ��
		//�������� n��Ʈ ȸ���� ���� ��ȯ�ϴ� lRotate �޼ҵ带 �ۼ�
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���� x�� n��Ʈ ȸ���մϴ�.");
		System.out.print("x:"); int x = stdIn.nextInt();
		System.out.print("n:"); int n = stdIn.nextInt();
		System.out.print("ȸ�� ��:"); printBits(x);
		
		System.out.print("\n������ ȸ�� = "); printBits(rRotate(x,n));
		System.out.print("\n���� ȸ�� = "); printBits(lRotate(x,n));
	}

}
