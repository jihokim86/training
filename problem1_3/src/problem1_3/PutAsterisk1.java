package problem1_3;

import java.util.Scanner;

public class PutAsterisk1 {

	public static void main(String[] args) {
// 입력한 값의 개수만큼 "*"를 표시하는 프로그램을 작성해라
// 마지막에는 줄 바꿈 문자를 출력할것. 단 읽은 값이 1미만이면 줄바꿈 문자를 표시해서는 안된다.
	Scanner input = new Scanner(System.in);
	
	int a;
	do {
	System.out.print("몇개의 * 를 표시할까요? : ");
	a = input.nextInt();
	}while(a<1);
		
	for(int i=0; i<a ; i++) {
		System.out.print("*");
	}
	input.close();
  }
}
