package problem1_9;

import java.util.Scanner;

public class PointTotalization {

	public static void main(String[] args) {
		//6���� �� ����(����,����) ������ ���� ����/ �л��� ���
		Scanner input = new Scanner(System.in);
		
		final int number =6;
		int[][] point = new int[number][2];
		int[] sumStudent = new int[number];
		int[] sumSubject = new int[2];
		
		System.out.printf("%d���� ����, ���� ������ �Է��ϼ���.\n",number);
		
		for(int i=0; i < number ; i++) {
			System.out.printf("%2d�� ���� :",i+1);
			point[i][0]=input.nextInt();
			System.out.println("    ����");
			point[i][1]=input.nextInt();
			
			sumStudent[i] = point[i][0] + point[i][1];
			sumSubject[0] += point[i][0];
			sumSubject[1] += point[i][1];
		}
		System.out.println("No.����   ����   ���");
		for(int i=0; i<number; i++) {
			System.out.printf("%2d %6d %6d %6.1f\n",i+1,point[i][0],point[i][1],(double)sumStudent[i]/2);
			System.out.printf("���%6.1f %6.1f\n",(double)sumSubject[0]/number,(double)sumSubject[1]/number);
		
		}
	}

}
