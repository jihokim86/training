package problem1_4;

import java.util.Scanner;

public class HeightWeight {
 public static void main(String[] args) {
	 //신장별 표준 체중 대응표를 표시하는 프로그램을 작성
	 // 표시할 신장의 범위(시작값/종료값/증가값)는 정수로 입력받을것
	 // 표준체중(신장-100) x 0.9
	 
	 Scanner input = new Scanner(System.in);
	 System.out.print("몇 cm부터 :");
	 int a= input.nextInt();
	 System.out.print("몇 cm까지 :");
	 int b= input.nextInt();
	 System.out.print("몇 cm 단위 :");
	 int c= input.nextInt();
	 
	 System.out.println("--------------");
	 
	 for(int i =a; i<=b ; i=i+c)
	 System.out.println(i+" "+ (i-100)*0.9);
	 input.close();
 }
}
