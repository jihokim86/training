package problem1_13;

import java.util.Scanner;

public class CoordinateTest1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.println("좌표 p를 입력하세요.");
		System.out.print("X좌표 : "); double x = input.nextDouble();
		System.out.print("Y좌표 : "); double y = input.nextDouble();
		
		Coordinate p = new Coordinate(x, y);
		System.out.println("p = ("+p.getX()+","+p.getY()+")");
		Coordinate q =p; //p의 주소값을 q에 저장함
		System.out.println("p = ("+q.getX()+","+q.getY()+")");
		q.set(1.1, 1.2);
		System.out.println("p = ("+q.getX()+","+q.getY()+")");
	}
}
