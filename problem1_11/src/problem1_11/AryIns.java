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
		//�迭 a�� ��� a[idx]�� x�� �����ϴ� aryIns �޼ҵ带 �ۼ�
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("��� �� :");
		int x = input.nextInt();
		int[] a= new int[x];
		
		for(int i =0 ; i<a.length ; i++) {
			System.out.print("a["+i+"]:");
			a[i] = input.nextInt();
		}
		
		System.out.print("������ ����� �ε��� : ");
		int idx = input.nextInt();
		System.out.print("������ �� ");
		int n = input.nextInt();
		
		aryIns(a, idx,n);
		for(int i=0;i<x;i++) {
			System.out.println("a["+i+"]="+a[i]);
		}
	}

}
