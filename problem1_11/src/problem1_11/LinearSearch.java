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
		//�迭 a�� ���� key�� ���� ���� ������ ��Ҹ� Ž��
		
		Scanner input = new Scanner(System.in);
		System.out.print("��� �� :");
		int x = input.nextInt();
		int[] a = new int[x];
		
		for(int i=0; i<x ; i++) {
			System.out.print("a["+i+"]:");
			a[i] = input.nextInt();
		}
		
		System.out.print("ã�� ��:"); 
		int key = input.nextInt();
		
		int idTop = linearSearch(a, key);
		int idxBtm = linearSearchR(a, key);
		
		if(idTop ==-1) {
			System.out.println("�ش簪�� ���� ���� �ʴ´�.");
		}else if(idTop == idxBtm) {
			System.out.println("�ش� ���� x["+ idTop+"�� �ֽ��ϴ�.");
		}else {
			System.out.println("�ش簪�� ������ �����մϴ�.");
			System.out.println("�տ� ��ġ�� ���� x["+ idTop+"]�� �ֽ��ϴ�.");
			System.out.println("�ڿ� ����ġ�� ���� x["+ idxBtm+"]�� �ֽ��ϴ�.");
		}
		
	}

}
