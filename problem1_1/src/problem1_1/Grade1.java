package problem1_1;

import java.util.Scanner;

public class Grade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Է��� ������ ���� ��/��/��/��/�� �� �����ϴ� ���α׷��� �ۼ��ض�
				//������ �������� ���� ����(���� ������ &&�� �̿�
				
		        Scanner input = new Scanner(System.in);
				
				System.out.println("������ �Է��Ͻø� ����� ��µ˴ϴ�");
				
				int a= input.nextInt();
				
				if(a<=100 && a >= 90) {
					System.out.print("�Էµ� ���� "+a+" ���� ");
					System.out.println("\"��\" ����Դϴ�");
				}else if(a <90 && a>=80) {
					System.out.print("�Էµ� ���� "+a+" ���� ");
					System.out.println("\"��\" ����Դϴ�");
				}else if(a <80 && a>=70) {
					System.out.print("�Էµ� ���� "+a+" ���� ");
					System.out.println("\"��\" ����Դϴ�");
				}else if(a <70 && a>=60) {
					System.out.print("�Էµ� ���� "+a+" ���� ");
					System.out.println("\"��\" ����Դϴ�");
				}else if(a<60 && a>=0){
					System.out.print("�Էµ� ���� "+a+" ���� ");
					System.out.println("\"��\" ����Դϴ�.");
				}else {
					System.out.print("�Էµ� ���� "+a+" ���� ");
					System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
				}
				input.close();
	}

}
