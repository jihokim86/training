package problem1_8;

import java.util.Scanner;

public class PointSumAve {

	public static void main(String[] args) {
		//���� ������ �հ�,���,�ְ���,�������� ���ϴ� ���α׷�
		//��� ���� ������ Ű���带 ���� �Է� ���� ��.
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("��� ��:");
		int a = input.nextInt();
		int[] scores = new int[a];
		System.out.println("������ �Է��ϼ���");
		int sum=0;
		
		
		for(int i=0; i<scores.length;i++) {
			System.out.print((i+1)+"���� ����: ");
			scores[i] = input.nextInt();
			sum += scores[i];
		}
		
		int max = scores[0];
		int min = scores[0];
		for(int i=0; i<scores.length;i++) {
			if(max>scores[i]) {
				max=scores[i];
			}
			if(min<scores[i]) {
				min=scores[i];
			}
		}
		System.out.println("�հ��"+sum+"���Դϴ�");
		System.out.println("�����"+(double)sum/a+"���Դϴ�");
		System.out.println("�����"+(double)sum/a+"���Դϴ�");
		System.out.println("�ְ�����"+max+"���Դϴ�");
		System.out.println("��������"+min+"���Դϴ�");
	}

}
