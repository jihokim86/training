package problem1_1;

import java.util.Scanner;

public class GoInto5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력한 정수값이 5로 나누어 떨어지면 "이 값은 5로 나누어집니다."
				// 그렇지 않으면 5로 나누어지지 않습니다" 라고 표시하세요
				// 음수를 입력한 경우에는 "음수를 입력했습니다"라고 표시할것
				
				Scanner input = new Scanner(System.in);
				
				System.out.println("정수값을 입력하세요");
				int a = input.nextInt();
				
				if(a>0){
				  if(a%5==0){
					  System.out.println("이 값은 5로 나누어집니다");
				  }else{
					  System.out.println("이 값은 5로 나누어지지 않습니다");
				  }
			     }else if(a==0){
					System.out.println("0은 나눌 수 없습니다.");
		         }else {
		        	 System.out.println("음수를 입력하셨습니다.");
		         }
				input.close();
	}

}
