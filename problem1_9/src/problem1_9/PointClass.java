package problem1_9;

import java.util.Scanner;

public class PointClass {

	public static void main(String[] args) {
		//�б� �� , �� �б��� �л���, �׸��� ��� �л��� ������ �о
		// �հ�� ����� ���ϴ� ���α׷��� �ۼ�
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("�б� ��:");
		int classNum = input.nextInt();
		int[][] point = new int[classNum][];
		int totNumber = 0;
		
		for(int i=0; i<point.length;i++) {
			System.out.printf("\n%d���� �л� ��:",i+1);
			int num = input.nextInt();
			point[i] = new int[num];
			totNumber += num;
			for(int j=0; j<point[i].length;j++) {
				System.out.printf("%d���� %d���� ���� :",i+1,j+1);
				point[i][j] = input.nextInt();
			}
		}
		System.out.println("�� |:�հ�  ���");
		System.out.println("---------------");
		int total =0;
		for(int i=0;i <point.length;i++) {
			int sum=0;
			for(int j=0; j<point[i].length;j++) {
				sum += point[i][j];
			}
			total +=sum;
			System.out.printf("%2d�� : %7d %7.1f\n",i+1,sum,(double)sum/point[i].length);
			}
		System.out.println("-------------------------");
		System.out.printf("�� : %7d %7.1f\n",total,(double)total/totNumber);
		
		}
	}


