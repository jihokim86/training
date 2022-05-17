package problem1_7;

import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args) {
		//배열의 요소수와 개별 요소의 값을 입력 받아서 표시하는 프로그램을 작성
		//표시 형식은 배열 초기값과 같은 형식으로, 각 요소의 쉼표로 연결하고
		//{}로 감싼 형태이다.
		
		Scanner input = new Scanner(System.in);
		System.out.print("요소수 :");
		int a= input.nextInt();
		int[] num=new int[a];
		int[] num2=new int[a];
		
		for(int i=0;i<num.length;i++ ) {
			System.out.print("num["+i+"] = " );
			num2[i] = input.nextInt();
		}
		
		
			System.out.print("num2={");
			
		for(int j=0;j<num.length;j++) {
			System.out.print(num2[j]+",");
		}
			System.out.println("}");
	}
	
}
