package problem1_1;

import java.util.Scanner;

public class Modulo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력한 정수값을 3으로 나눈다. 그리고 그 결과에 따라 
				// 이 값은 3을 나누어 집니다. 이 값을 3으로 나눈 나머지는 1입니다
				// 이 값을 3을 나눈 나머지는 2입니다.
				// 양수가 아닌 값을 입력했습니다.
				
				Scanner input = new Scanner(System.in);
				System.out.println("정수값을 입력하세요");
				int a = input.nextInt();
				if(a>0) {
				  if(a%3 == 0) {
					  System.out.println("입력한 값 :"+ a);
					  System.out.println("3으로 나누어 집니다");
				  }else if(a%3 ==1) {
					  System.out.println("입력한 값 :"+ a);
					  System.out.println("3으로 나눈 나머지는 1입니다");
				  }else {
					  System.out.println("입력한 값 :"+ a);
					  System.out.println("3으로 나눈 나머지는 2입니다");
				  }
			    }else {
			    	  System.out.println("입력한 값 :"+ a);
					  System.out.println("입력한 값은 양수가 아닙니다.");
			    }
				input.close();
	}

}
