package problem1_9;

import java.util.Scanner;

public class UnevennessArray {

	public static void main(String[] args) {
		//�࿡ ���� ���� ������ �ٸ� 2���� �迭�� ��������
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("���Ģ�� 2���� �迭�� �����մϴ�.");
		System.out.print("�� ��:");
		int height = input.nextInt();
		
		int[][] c = new int[height][];
		
		for(int i=0; i<c.length;i++) {
			System.out.print(i+"��°�� �� ��");
			int width = input.nextInt();
			c[i]=new int[width]; //i��° ���� �氹�� ���ϱ�
		}
		
		System.out.println("�� ����� ���� �Է��ϼ���");
		for(int i=0; i<c.length;i++) {
			for(int j=0; j<c[i].length;j++) { //���� �氹�� ���̸�ŭ
				System.out.printf("c[%d][%d]:",i,j);
				c[i][j] = input.nextInt();
			}
		}
		
		System.out.println("�迭c�� �� ��Ұ��� ������ �����ϴ�.");
		
		for(int i=0; i< c.length; i++) {
			for(int j=0; j<c[i].length;j++) {
				System.out.printf("%3d",c[i][j]);
			}
			System.out.println();
		}
	}

}
