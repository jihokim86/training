package problem1_10;

import java.util.Scanner;

public class SeasonString {

		static String seasonOf(int m) {
			
			switch(m) {
			case 3: case 4: case 5: return "봄";
			case 6: case 7: case 8: return "여름";
			case 9: case 10: case 11: return "가을";
			case 12: case 1: case 2: return "겨울";
			}
		
		return "";
		}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int month;
		do {
			System.out.print("몇 월입니까(1~12):");
			month = input.nextInt();
		}while(month>12 && month<1);
		
		System.out.println("해달 월의 계절은 "+ seasonOf(month)+"입니다.");
	}
}
