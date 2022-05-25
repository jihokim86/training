package problem1_13;

import java.util.Scanner;

public class CoordinateTester3Error {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("좌표는 몇 개 : ");
		int n= input.nextInt();
		
		Coordinate[] a = new Coordinate[n]; //????
		//int[] a= new int[n];
		
		for(int i=0; i<a.length; i++) {
			//a[i].set(5.5, 7.7); 컴파일오류
			a[i] = new Coordinate(5.5,7.7);
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.printf("a[%d]=(%.1f,%.1f)\n",i,a[i].getX(),a[i].getY());
		}

	}
}
