package problem1_8;

import java.util.Scanner;

public class LinearSearchTop {

	public static void main(String[] args) {
		//�迭���� Ư�� ���� ������ ��Ҹ� ã�ƶ�.
		//���� ���� ��Ұ� ������ ������ ���� �տ� ��ġ�� ��Ҹ� ã�� 
		//���α׷��� ����ڿ� �ִ� ��Ҹ� ã�� ���α׷��� �ۼ�����.
		
		Scanner input = new Scanner(System.in);
		System.out.print("��� ��:");
		int n = input.nextInt();
		int[] a=new int[n];
		
		for(int i=0; i<a.length;i++) {
			System.out.print("a["+i+"] = ");
			a[i]=input.nextInt();
		}
		
		System.out.print("ã������:");
		int num = input.nextInt();
		
		for(int i=0; i<a.length;i++) {
			if(a[i]==num) {
				System.out.println("�� ���� a["+i+"]�� �ֽ��ϴ�.");
			}
			if(a[i])
		}	
				System.out.println("�ش� ���� �������� �ʽ��ϴ�.");
  }
}
