package problem1_11;

import java.util.Scanner;

public class MinOfHeightWeight {
	
	static int min(int[] k) {
		int min = k[0];
		
		for(int i = 0 ; i<k.length ; i++) {
			if(k[i]<min) {
				min = k[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		//�迭�� �ּ� ���� ���ϴ� minOf�żҵ带 �ۼ�
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("�����:");
		int x = input.nextInt();
		
		int[] y = new int[x];
		int[] z = new int[x];
		
		for(int i=0; i<x; i++) {
			System.out.print(i+1+"���� ���� :");
			y[i] = input.nextInt();
			System.out.print(i+1+"���� ü�� :");
			z[i] = input.nextInt();
		}
		
		System.out.println("���� Ű�� ���� ����� ���� : "+min(y));
		System.out.println("���� ���� ����� ü�� : "+min(z));
	}

}
