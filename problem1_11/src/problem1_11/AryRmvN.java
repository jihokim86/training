package problem1_11;

import java.util.Scanner;

public class AryRmvN {
	
	static void aryRmvN(int[] a, int idx, int n) {
		for(int i=idx; i<=idx+n-1; i++) {
			a[i] = a[i+n]; //?? ��...
		}
	}

	public static void main(String[] args) {
		//�迭 a���� ���a[idx]���� n���� ��Ҹ� �����ϴ� �޼ҵ带 �ۼ�
		
		Scanner input = new Scanner(System.in);
		System.out.print("��Ҽ�:");
		int num = input.nextInt();
		int[] a= new int[num];
		System.out.println(a.length);
		for(int i=0 ; i<num ; i++) {
			System.out.print("a["+i+"]:");
			a[i] = input.nextInt();
		}
		
		System.out.println("������ ������ �ε��� : ");
		int idx = input.nextInt();
		System.out.println("������ ��Ҽ� : ");
		int n = input.nextInt();
		
		
		aryRmvN(a, idx, n);
		for(int i=0; i <a.length; i++) {
			System.out.println("a["+i+"]="+a[i]);
		}
		}
	}


