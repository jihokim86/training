package problem1_20;

import java.util.Scanner;

public class PrintSrtingArray {
	
	static void printStringArray(String[] a) {
		for(int i=0; i<a.length;i++) {
			for(int j=0 ; j<a[i].length();j++) {
			System.out.print(a[i].charAt(j));
			System.out.println();
			
			}
		}
	}

	public static void main(String[] args) {
		// String 배열에 저장된 모든 문자열을 표시하는 매소드
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("문자열의 개수:");
		int n = stdIn.nextInt();
		String[] a= new String[n];
		for(int i=0;i<a.length;i++) {
			System.out.print("a["+i+"]=");
			a[i]=stdIn.next();
		}
		printStringArray(a);
		}
	}


