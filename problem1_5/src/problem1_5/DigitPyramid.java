package problem1_5;

import java.util.Scanner;

public class DigitPyramid {

	public static void main(String[] args) {
		//n���� ���� �Ƕ�̵带 ǥ���ϴ� ���α׷��� �ۼ�
		//i��° �࿡�� i%10�� ǥ��
		Scanner input = new Scanner(System.in);
		int a;
		int h=1;
		System.out.println("�����Ƕ�̵带 ǥ���մϴ�");
		do {
			System.out.print("�ܼ��� :");
			a= input.nextInt();
		}while(a<0);
		
		for(int i=1; i<=a ; i++) {
			for(int j=1 ; j<=a-i+1;j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=1+2*(i-1);k++) {
				System.out.print(h);
			}
			h++;
			if(h==10) { //20�� �Ѿ�� �ȵ��� �˾Ҵµ�? �Ǵ��ϰŰ�����
				h=0;
			}
			System.out.println();
		}
		input.close();
	}
}
