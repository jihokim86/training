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
		// String �迭�� ����� ��� ���ڿ��� ǥ���ϴ� �żҵ�
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���ڿ��� ����:");
		int n = stdIn.nextInt();
		String[] a= new String[n];
		for(int i=0;i<a.length;i++) {
			System.out.print("a["+i+"]=");
			a[i]=stdIn.next();
		}
		printStringArray(a);
		}
	}


