package problem1_13;

import java.util.Scanner;

public class CoordinateTest1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.println("��ǥ p�� �Է��ϼ���.");
		System.out.print("X��ǥ : "); double x = input.nextDouble();
		System.out.print("Y��ǥ : "); double y = input.nextDouble();
		
		Coordinate p = new Coordinate(x, y);
		System.out.println("p = ("+p.getX()+","+p.getY()+")");
		Coordinate q =p; //p�� �ּҰ��� q�� ������
		System.out.println("p = ("+q.getX()+","+q.getY()+")");
		q.set(1.1, 1.2);
		System.out.println("p = ("+q.getX()+","+q.getY()+")");
	}
}
