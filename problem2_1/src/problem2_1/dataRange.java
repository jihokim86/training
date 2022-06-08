package problem2_1;

import java.util.Scanner;

public class dataRange {

	public static void main(String[] args) {
		//���ڿ� ������ ������ ������ ������ �� �ִ� ���α׷��� �ۼ�
		//�Է¹��� ���ڿ� ������ ���� ���� ������ �״�� ����ϰ� ������ ����� 
		//���������� ���
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("�Է��� Ÿ���� �����ΰ���?");
		System.out.print("(1.byte / 2. short / 3.int / 4. long / 5. char) : ");
		int key = input.nextInt();
		
		switch (key) {
		case 1:
			System.out.print("���� ���� �Է��ϼ��� :");
			long byteType = input.nextLong();
			if(byteType>Byte.MIN_VALUE && byteType<Byte.MAX_VALUE)
				System.out.println("�Է��� �������� byte type "+byteType+" �Դϴ�.");
			if(byteType<Byte.MIN_VALUE || byteType>Byte.MAX_VALUE)
				System.out.println("������ �ʰ��Ͽ���!");
			break;
		case 2:
			System.out.print("���� ���� �Է��ϼ��� :");
			long shortType = input.nextLong();
			if(shortType>Short.MIN_VALUE && shortType<Short.MAX_VALUE)
				System.out.println("�Է��� �������� byte type "+shortType+" �Դϴ�.");
			if(shortType<Short.MIN_VALUE || shortType>Short.MAX_VALUE)
				System.out.println("������ �ʰ��Ͽ���!");
			break;
		case 3:
			System.out.print("���� ���� �Է��ϼ��� :");
			long intType = input.nextLong();
			if(intType>Integer.MIN_VALUE && intType<Integer.MAX_VALUE)
				System.out.println("�Է��� �������� byte type "+intType+" �Դϴ�.");
			if(intType<Integer.MIN_VALUE || intType>Integer.MAX_VALUE)
				System.out.println("������ �ʰ��Ͽ���!");
			break;
		case 4:
			System.out.print("���� ���� �Է��ϼ��� :");
			long longType = input.nextLong();
			if(longType>Long.MIN_VALUE && longType<Long.MAX_VALUE)
				System.out.println("�Է��� �������� byte type "+longType+" �Դϴ�.");
			if(longType<Long.MIN_VALUE || longType>Long.MAX_VALUE)
				System.out.println("������ �ʰ��Ͽ���!");
			break;
		case 5:
			System.out.print("���ڸ� �Է��ϼ��� :");
			char charType = input.next().charAt(0);
			if(charType> 0 && charType<65535)
				System.out.println("���ڰ��� char type '"+charType+"' �Դϴ�.");
			if(charType<0 || charType>65535)
				System.out.println("������ �ʰ��Ͽ���!");
			break;

		default:
			break;
		}
		input.close();
	}
}
