package problem1_13;

import java.util.Scanner;

public class CarTest2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("���������͸� �Է��ϼ���");
		System.out.print("�̸� : "); String name = input.next();
		System.out.print("��ȣ : "); String number = input.next();
		System.out.print("���� : "); int width = input.nextInt();
		System.out.print("���� : "); int height = input.nextInt();
		System.out.print("���� : "); int length = input.nextInt();
		System.out.print("��ũ�뷮 : "); double tankage = input.nextDouble();
		System.out.print("���ᷮ : "); double fuel=input.nextDouble();
		System.out.print("���� : "); double sfc = input.nextDouble();
		
		Car myCar = new Car(name, number, width, height, length, tankage, fuel, sfc);
		
		while(true) {
			System.out.printf("���� ��ġ : (%.2f, %.2f)\n",myCar.getX(),myCar.getY());
			System.out.printf("���� ���� : %.2f\n",myCar.getFuel());
			System.out.println("�̵��ϰڽ��ϱ�?[0_NO/1_YES]");
			if(input.nextInt()==0) {
				break;
			}
			System.out.println("x���������� �̵� �Ÿ� : ");
			double dx = input.nextDouble();
			
			System.out.println("y���������� �̵� �Ÿ� : ");
			double dy = input.nextDouble();
			
			if(!myCar.move(dx, dy)) {
				System.out.println("���κ���!!");
			}
		}
		input.close();		
	}

}