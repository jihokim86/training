package problem2_4;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMedMin {

	public static void main(String[] args) {
		//10���� �� �� �ִ밪, �ּҰ�, �߰����� ���ؼ� ���
		
		Scanner input = new Scanner(System.in);
		
		int[] num = new int[10];
		
		for(int i=0; i<num.length; i++) {
			num[i] = input.nextInt();
		}
		
		Arrays.sort(num);
		
		System.out.println("�ּҰ�:"+num[0]);
		System.out.println("�ִ밪:"+num[9]);
		System.out.println("�߰���:"+((double)num[5]+num[4])/2);
		
	}

}
