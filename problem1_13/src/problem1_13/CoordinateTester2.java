package problem1_13;

import java.util.Scanner;

public class CoordinateTester2 {
	static boolean compCoordinate(Coordinate c1,Coordinate c2) {
		return c1.getX() == c2.getX() && c1.getY() == c2.getY();
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("��ǥ p�� �Է��ϼ���");
		System.out.print("X ��ǥ : "); double x = input.nextDouble();
		System.out.print("Y ��ǥ : "); double y = input.nextDouble();
		Coordinate p = new Coordinate(x, y);
		
		System.out.println("��ǥ q�� �Է��ϼ���");
		System.out.print("X ��ǥ : "); x = input.nextDouble();
		System.out.print("Y ��ǥ : "); y = input.nextDouble();
		Coordinate q = new Coordinate(x, y);
		
		System.out.println((p==q)?"p==q�Դϴ�.":"p!=q�Դϴ�");
		//������ ��ü�� �ּҰ� �������� ����~ ������ P!=q�̴�.
		
		System.out.println(p.getX()==q.getX() && p.getY()==q.getY()?
				"p==q�Դϴ�.":"p!=q�Դϴ�");
		// �ʵ� ���� ���ϴ� �Ͱ���.
		
		System.out.println(compCoordinate(p, q)
				?"p==q�Դϴ�.":"p!=q�Դϴ�");
	}

}