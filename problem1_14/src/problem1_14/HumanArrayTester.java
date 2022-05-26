package problem1_14;

import java.util.Scanner;

public class HumanArrayTester {
	// Human�� 1���� �迭�� ��� ��Ҹ� ǥ��
	static void printHumanArray(Human[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("No.%d %s %3dcm %3dkg\n",i,a[i].getName()
			,a[i].getHeight(),a[i].getWeight());
		}
	}
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n;
		
		//------------------1���� �迭---------------//
		//������ ���ÿ� �ʱ�ȭ
		Human[] p = {new Human("ö��",170,70), new Human("�浿",160,59)};
		
		//�迭�� ������ �ν��Ͻ��� ���������� ����
		System.out.print("�迭 q�� ��Ҽ�:");
		n = input.nextInt();
		
		Human[] q = new Human[n];
		for (int i = 0; i < q.length; i++) {
			System.out.println("q["+i+"]");
			System.out.print("�̸�:"); String name = input.next();
			System.out.print("����:"); int height = input.nextInt();
			System.out.print("ü��:"); int weight = input.nextInt();
			q[i] = new Human(name,height,weight);
		}
		
		//-----------------2���� �迭--------------------//
		//������ ���ÿ� �ʱ�ȭ(3�� 2��)
		Human[][] x = {
				{new Human("��ö��", 175 , 52), new Human("�迵��", 169 , 60)},
				{new Human("ȫ�浿", 178 , 70), new Human("��ö��", 172 , 61)},
				{new Human("�̿���", 168 , 59), new Human("��ö��", 165 , 59)},
		};
		
		//�迭�� ������ �ν��Ͻ��� ���������� ����(�ұ�Ģ �迭)
		System.out.print("�迭 y�� �� ��:");
		n = input.nextInt();
		
		Human[][] y = new Human[n][];
		for (int i = 0; i < y.length; i++) {
			System.out.print("y["+i+"]�� �� �� : ");
			n = input.nextInt();
			y[i] = new Human[n];
			for (int j = 0; j < y[i].length; j++) {
				System.out.println("y["+i+"]["+j+"]");
				System.out.print("�̸�:"); String name = input.next();
				System.out.print("����:"); int height = input.nextInt();
				System.out.print("ü��:"); int weight = input.nextInt();
				y[i][j] = new Human(name, height, weight);
			}
		}
		
		//------------------------���---------------------------------//
		// 1���� �迭
		System.out.println("��迭 p");
		printHumanArray(p);
		
		System.out.println("��迭 q");
		printHumanArray(q);
		
		//2���� �迭
		System.out.println("��迭 x");
		for (int i = 0; i < x.length; i++) {
			System.out.printf("%d��\n",i);
			printHumanArray(x[i]);
		}
		
		System.out.println("��迭 y");
		for (int i = 0; i < y.length; i++) {
			System.out.printf("%d��\n",i);
			printHumanArray(y[i]);
		}
		input.close();
		
	}

}
