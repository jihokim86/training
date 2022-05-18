package problem1_8;

import java.util.Scanner;

public class LinearSearchTop {

	public static void main(String[] args) {
		//배열에서 특정 값을 가지는 요소를 찾아라.
		//동일 값의 요소가 여러개 있으면 가장 앞에 위치한 요소를 찾는 
		//프로그램과 가장뒤에 있는 요소를 찾는 프로그램을 작성하자.
		
		Scanner input = new Scanner(System.in);
		System.out.print("요소 수:");
		int n = input.nextInt();
		int[] a=new int[n];
		
		for(int i=0; i<a.length;i++) {
			System.out.print("a["+i+"] = ");
			a[i]=input.nextInt();
		}
		
		System.out.print("찾을숫자:");
		int num = input.nextInt();
		
		for(int i=0; i<a.length;i++) {
			if(a[i]==num) {
				System.out.println("그 값은 a["+i+"]에 있습니다.");
			}
			if(a[i])
		}	
				System.out.println("해당 값이 존재하지 않습니다.");
  }
}
