package problem1_9;

import java.util.Scanner;

public class MatrixProduct {

	public static void main(String[] args) {
		//4�� 3���� 3�� 4���� ����� ���ϴ� ���α׷��� �ۼ�
		//�� ����� ���� Ű���带 ���� �Է� ������.
		
		Scanner input = new Scanner(System.in);
		int[][] a = new int[4][3];
		int[][] b = new int[3][4];
		int[][] c = new int[4][4];
		
		System.out.println("��� a�� ��Ҹ� �Է��ϼ���.");
		for(int i=0; i<4;i++) {
			for(int j=0; j<3 ; j++) {
				System.out.printf("a[%d][%d]:",i,j);
				a[i][j] = input.nextInt();
			}
		}
		
		for(int i=0; i<3;i++) {
			for(int j=0; j<4 ; j++) {
				System.out.printf("b[%d][%d]:",i,j);
				b[i][j] = input.nextInt();
			}
		}
		
		for(int i=0; i<4;i++) {
			for(int j=0; j<4;j++) {
				c[i][j]=0;
				for(int k=0; k<3 ; k++) {
					c[i][j] +=a[i][k]*b[k][j];
				}
			}
		}
		
		System.out.println("��� a�� b�� ��");
		for(int i=0; i<3;i++) {
			for(int j=0; j<4 ; j++) {
				System.out.printf("%5d:",c[i][j]);
			}
			System.out.println();
		}
	}
}
