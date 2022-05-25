package problem1_11;

import java.util.Scanner;

public class AryRmv {
	
	static void aryRmv(int[] a,int idx) {
		for(int i=idx; i<a.length-1; i++) {
				a[i]=a[i+1];
		}
	}

	public static void main(String[] args) {
		//배열 a로 부터 요소 a[idx]를 삭제하는 aryRmv매소드를 작성
		Scanner input = new Scanner(System.in);
		
		System.out.print("요소 수 :");
		int x = input.nextInt();
		int[] a= new int[x];
		
		for(int i =0 ; i<a.length ; i++) {
			System.out.print("a["+i+"]:");
			a[i] = input.nextInt();
		}
		
		System.out.print("삭제할 요소의 인덱스 : ");
		int idx = input.nextInt();
		
		aryRmv(a, idx);
		for(int i=0;i<x;i++) {
			System.out.println("a["+i+"]="+a[i]);
		}
	}

}
