package problem1_7;

import java.util.Scanner;

public class ColumnChart {

	public static void main(String[] args) {
		//int�� �迭�� �� ��ҿ� 1~10�� ������ �����ϰ� �� ����� ���� 
		//����׷����� ǥ���ϴ� ���α׷��� �ۼ�.
		//���������� �ε����� 10�� ���� �������� ǥ��
		
		Scanner input = new Scanner(System.in);
		System.out.print("��Ҽ� : ");
		int e = input.nextInt();
		int[] num = new int[e];
		
		
		for(int i=0; i<num.length ;i++) {
			num[i]=(int)(Math.random()*10);
		}
			
		for(int i=10; i>=0 ;i--) {
			for(int j=0;j < e ;j++ ) {
				if(i<num[j]) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i=0; i<num.length;i++) {
			System.out.print(num[i]);
		}
	}
}
