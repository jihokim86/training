package test1;

import java.util.Scanner;

public class Point {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("학급 수:");
		int classNum = stdIn.nextInt();
		int[][] point = new int[classNum][];
		int totNumber = 0;
		
		for (int i = 0; i < point.length; i++) {
			System.out.printf("\n%d반의 학생 수 :" , i+1);
			int num = stdIn.nextInt();
			point[i] = new int[num];
			totNumber += num;
			
			for (int j = 0; j < point[i].length; j++) {
				System.out.printf("\n%d번의 점수 :",i+1,j+1);
				point[i][j] = stdIn.nextInt();
			}
		}
		
		System.out.println("반 | 합계 평균");
		System.out.println("-------+---------------");
		int total =0;
		
		for (int i = 0; i < point.length; i++) {
			int sum=0;
			for (int j = 0; j < point[i].length; j++) {
				sum += point[i][j];
				total = point[i][j];
				System.out.printf("%2d반 | %7d%7.1f\n",i+1,sum,(double)sum/point[j].length);
			}
			System.out.println("-------+---------------");
			System.out.printf("   합반 | %7d%7.1f\n",total,(double)total/totNumber);
		}
		
		
	}//end of main

}//end of class
