package problem1_7;

import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args) {
		//�迭�� ��Ҽ��� ���� ����� ���� �Է� �޾Ƽ� ǥ���ϴ� ���α׷��� �ۼ�
		//ǥ�� ������ �迭 �ʱⰪ�� ���� ��������, �� ����� ��ǥ�� �����ϰ�
		//{}�� ���� �����̴�.
		
		Scanner input = new Scanner(System.in);
		System.out.print("��Ҽ� :");
		int a= input.nextInt();
		int[] num=new int[a];
		int[] num2=new int[a];
		
		for(int i=0;i<num.length;i++ ) {
			System.out.print("num["+i+"] = " );
			num2[i] = input.nextInt();
		}
		
		
			System.out.print("num2={");
			
		for(int j=0;j<num.length;j++) {
			System.out.print(num2[j]+",");
		}
			System.out.println("}");
	}
	
}
