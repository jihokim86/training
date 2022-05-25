package problem1_11;

import java.util.Scanner;

public class LinearSearch {
	
	static int linearSearch(int[] a, int key){
		for(int i =0 ; i<a.length; i++) {
			if(a[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	static int linearSearchR(int[] a, int key) {
		for(int i =a.length-1 ; i>=0; i--) {
			if(a[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		//배열 a로 부터 key와 같은 값을 가지는 요소를 탐색
		
		Scanner input = new Scanner(System.in);
		System.out.print("요소 수 :");
		int x = input.nextInt();
		int[] a = new int[x];
		
		for(int i=0; i<x ; i++) {
			System.out.print("a["+i+"]:");
			a[i] = input.nextInt();
		}
		
		System.out.print("찾는 값:"); 
		int key = input.nextInt();
		
		int idTop = linearSearch(a, key);
		int idxBtm = linearSearchR(a, key);
		
		if(idTop ==-1) {
			System.out.println("해당값은 존재 하지 않는다.");
		}else if(idTop == idxBtm) {
			System.out.println("해당 값은 x["+ idTop+"에 있습니다.");
		}else {
			System.out.println("해당값은 여러개 존재합니다.");
			System.out.println("앞에 위치한 값은 x["+ idTop+"]에 있습니다.");
			System.out.println("뒤에 ㄷ위치한 값은 x["+ idxBtm+"]에 있습니다.");
		}
		
	}

}
