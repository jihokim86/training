package problem1_10;

import java.util.Random;
import java.util.Scanner;

public class RandomTester {
	static int random(int min, int max) {
		if(max <= min) {
			return min;
		}else {
			Random num = new Random();
			return min+num.nextInt(max-min+1);
		}
	}

	public static void main(String[] args) {
		//������ �����ؼ� ��ȯ�ϴ� random �żҵ带 �ۼ�
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("������ �����մϴ�");
		System.out.print("���Ѱ�:"); int min = input.nextInt();
		System.out.print("���Ѱ�:"); int max = input.nextInt();
		
		System.out.println("������ ������ "+ random(min,max) +"�Դϴ�");
		
	}

}
