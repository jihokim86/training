package problem1_3;

import java.util.Scanner;

public class PutAsterisk2 {

	public static void main(String[] args) {
//입력한 값의 갯수만큼 *를 표시하는 프로그램을 작성.
//마지막에는 줄바꿈 문자를 출력할것. 읽은 값이 1미만이면 줄바꿈문자를 표시하지마라
		
		Scanner input = new Scanner(System.in);
		System.out.print("몇개의 *를 표시할까요?:");
		int a = input.nextInt();
		if(a>0) {
			int i =0;
			while(i<a) {
				System.out.print("*");
				i++;
			}
		}
		System.out.println();
		input.close();
	}
}
