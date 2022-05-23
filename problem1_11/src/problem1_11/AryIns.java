package problem1_11;

import java.util.Scanner;

public class AryIns {
	static void aryIns(int[] a, int idx, int x) {
		if(idx >=0 && idx < a.length) {
			for(int i= a.length-1 ; i>idx ; i--) {
				a[i] = a[i-1];
				
			}
			a[idx]=x;
		}
	}

	public static void main(String[] args) {
		//배열 a의 요소 a[idx]에 x를 삽입하는 aryIns 메소드를 작성
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("요소 수 :");
		int x = input.nextInt();
		int[] a= new int[x];
		
		for(int i =0 ; i<a.length ; i++) {
			System.out.print("a["+i+"]:");
			a[i] = input.nextInt();
		}
		
		System.out.print("삽입할 요소의 인덱스 : ");
		int idx = input.nextInt();
		System.out.print("삽입할 값 ");
		int n = input.nextInt();
		
		aryIns(a, idx,n);
		for(int i=0;i<x;i++) {
			System.out.println("a["+i+"]="+a[i]);
		}
	}

}
