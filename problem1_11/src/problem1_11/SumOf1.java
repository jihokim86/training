package problem1_11;

import java.util.Scanner;

public class SumOf1 {
	
	static int sumOf(int[] a) {
		int sum=0;
		for(int i=0 ; i<a.length;i++) {
			sum = sum + a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		//�迭 a�� ���� ��� ����� ���� ���ϴ� sumOf()�żҵ带 �ۼ�
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��� ��:");
		int num = stdIn.nextInt();
		int[] a = new int[num];
		
		for(int i=0 ; i<a.length ; i++) {
			System.out.print("x["+i+"]:");
			a[i] = stdIn.nextInt();
		}
		
		System.out.println("��� ����� ����"+sumOf(a)+ "�Դϴ�.");
	}

}
