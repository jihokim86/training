package test1;

public class ScoresStudent {

	public static void main(String[] args) {
		//���� 98,70,45,60,83
		//1. ���� 2.��� 3.�ְ����� 4.��������
		
		 int[] scores = {98,70,45,60,83};
		 int sum=0;
		 int max=0;
		 int min=100; // min =scores[0] 0�� �迭���� �־���.
		 
		 for(int i=0;i<scores.length;i++) {
			 sum += scores[i];
			 if(scores[i]>max) {
				 max= scores[i];
			 }
			 if(scores[i]<min) {
				 min = scores[i];
			 }
		 }
		 double avg = (double)sum/scores.length;
		 
		System.out.println("������ :"+ sum);
		System.out.println("����� :"+ avg);
		System.out.println("�ְ������� :"+ max);
		System.out.println("�ְ������� :"+ min);
		System.out.println("====================");
		//Arrays.sort()�̿���
		//�������� �迭 ����
//		Arrays.sort(scores);
//		System.out.println("�ְ������� :"+ scores[0]);
//		System.out.println("�ְ������� :"+ scores[scores.length-1]);
	}
}
