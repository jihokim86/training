package problem1_11;

import java.util.Scanner;

public class AryRmv {
	
	static void aryRmv(int[] a,int idx) {
		for(int i=idx; i<a.length-1; i++) {
				a[i]=a[i+1];
		}
	}

	public static void main(String[] args) {
		//�迭 a�� ���� ��� a[idx]�� �����ϴ� aryRmv�żҵ带 �ۼ�
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
		
		aryRmv(a, idx);
		for(int i=0;i<x;i++) {
			System.out.println("a["+i+"]="+a[i]);
		}
	}

}
