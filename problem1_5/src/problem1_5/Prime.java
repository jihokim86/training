package problem1_5;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		//���� �������� �о �Ҽ����� �����ϴ� ���α׷�
		// �Ҽ��� 2�̻� n�̸��� ���� � ���ε� ���������� �ʴ� ������
		Scanner input = new Scanner(System.in);
		
		int a;
		
		do {
			System.out.print("2�̻��� ������:");
			a= input.nextInt();
		}while(a<2);
			
		for(int i=2; i<=a ; i++) {
			if(a==2 ||a%i !=0) {
				a=1;//�Ҽ���
			}else {
				a=0; //�Ҽ��ƴ�
			}
			if(a==1)
			System.out.println("�Ҽ��Դϴ�."); //1�̸� �Ҽ�
			if(a==0)
			System.out.println("�Ҽ��� �ƴ�"); //1�̸� �Ҽ�
		}
		input.close();
	}
}
