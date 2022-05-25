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
		//배열의 최소 값을 구하는 minOf매소드를 작성
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("사람수:");
		int x = input.nextInt();
		
		int[] y = new int[x];
		int[] z = new int[x];
		
		for(int i=0; i<x; i++) {
			System.out.print(i+1+"번의 신장 :");
			y[i] = input.nextInt();
			System.out.print(i+1+"번의 체중 :");
			z[i] = input.nextInt();
		}
		
		System.out.println("가장 키가 작은 사람의 신장 : "+min(y));
		System.out.println("가장 마른 사람의 체중 : "+min(z));
	}

}
