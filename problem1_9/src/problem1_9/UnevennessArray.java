package problem1_9;

import java.util.Scanner;

public class UnevennessArray {

	public static void main(String[] args) {
		//행에 따라 열의 개수가 다른 2차원 배열을 생성하자
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("블규칙한 2차원 배열을 생성합니다.");
		System.out.print("행 수:");
		int height = input.nextInt();
		
		int[][] c = new int[height][];
		
		for(int i=0; i<c.length;i++) {
			System.out.print(i+"행째의 열 수");
			int width = input.nextInt();
			c[i]=new int[width]; //i번째 열의 방갯수 정하기
		}
		
		System.out.println("각 요소의 값을 입력하세요");
		for(int i=0; i<c.length;i++) {
			for(int j=0; j<c[i].length;j++) { //열의 방갯수 길이만큼
				System.out.printf("c[%d][%d]:",i,j);
				c[i][j] = input.nextInt();
			}
		}
		
		System.out.println("배열c의 각 요소값은 다음과 같습니다.");
		
		for(int i=0; i< c.length; i++) {
			for(int j=0; j<c[i].length;j++) {
				System.out.printf("%3d",c[i][j]);
			}
			System.out.println();
		}
	}

}
