package problem2_3;

import java.util.Scanner;

public class Octal {
	
	static final int p = 2;
	
	static void trans(int y) {
		int count =0;
		int k=y;
		
		
		while(k>0) {
			 k= k/y;
			count++;
		}
		
		int[] value = new int[count];
			
		for(int i=0; i<value.length;i++) {
			value[i] = y%p;
			y=y/p;
		}
		
		for(int j=value.length-1; j>=0;j--) {
			
			System.out.print(value[j]);
		}
		
	}
	public static void main(String[] args) {
		//10���� -> 2������ ��ȯ�ϴ� ���α׷��� ����� ���� �Լ��� ����
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("10������ �Է��ϸ� %d������ �����մϴ� : ",p);
		int y = input.nextInt();
		
		trans(y);
	}

}
