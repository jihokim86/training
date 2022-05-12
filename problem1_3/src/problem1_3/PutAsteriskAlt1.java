package problem1_3;

import java.util.Scanner;

public class PutAsteriskAlt1 {

	public static void main(String[] args) {
//읽은 값의 개수만큼 * 과 + 를 번갈아 가며 표시하는 프로그램을 작성
//마지막에는 줄 바꿈 문자를 출력할 것
		Scanner input = new Scanner(System.in);
		int a ;
		do {
			System.out.print("몇개를 표시할까요?:"); 
			a=input.nextInt();
		}while(a<1);
		
		for(int i=0; i< a;i++) {
			if(i%2==0) {
				System.out.print("+");
			}
			if(i%2==1) {
				System.out.print("*");
			}
		}
		input.close();
	}
}
