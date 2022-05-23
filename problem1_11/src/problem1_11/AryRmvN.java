package problem1_11;

import java.util.Scanner;

public class AryRmvN {
	
	static void aryRmvN(int[] a, int idx, int n) {
		for(int i=idx; i<=idx+n-1; i++) {
			a[i] = a[i+n]; //?? 흠...
		}
	}

	public static void main(String[] args) {
		//배열 a에서 요소a[idx]부터 n개의 요소를 삭제하는 메소드를 작성
		
		Scanner input = new Scanner(System.in);
		System.out.print("요소수:");
		int num = input.nextInt();
		int[] a= new int[num];
		System.out.println(a.length);
		for(int i=0 ; i<num ; i++) {
			System.out.print("a["+i+"]:");
			a[i] = input.nextInt();
		}
		
		System.out.println("삭제를 시작할 인덱스 : ");
		int idx = input.nextInt();
		System.out.println("삭제할 요소수 : ");
		int n = input.nextInt();
		
		
		aryRmvN(a, idx, n);
		for(int i=0; i <a.length; i++) {
			System.out.println("a["+i+"]="+a[i]);
		}
		}
	}


