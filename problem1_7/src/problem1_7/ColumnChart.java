package problem1_7;

import java.util.Scanner;

public class ColumnChart {

	public static void main(String[] args) {
		//int형 배열의 각 요소에 1~10의 난수를 대입하고 각 요소의 값을 
		//막대그래프로 표시하는 프로그램을 작성.
		//마지막에는 인덱스를 10을 나눈 나머지를 표시
		
		Scanner input = new Scanner(System.in);
		System.out.print("요소수 : ");
		int e = input.nextInt();
		int[] num = new int[e];
		
		
		for(int i=0; i<num.length ;i++) {
			num[i]=(int)(Math.random()*10);
		}
			
		for(int i=10; i>=0 ;i--) {
			for(int j=0;j < e ;j++ ) {
				if(i<num[j]) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i=0; i<num.length;i++) {
			System.out.print(num[i]);
		}
	}
}
