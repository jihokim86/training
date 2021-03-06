package problem1_13;

import java.util.Scanner;

public class CoordinateTester2 {
	static boolean compCoordinate(Coordinate c1,Coordinate c2) {
		return c1.getX() == c2.getX() && c1.getY() == c2.getY();
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("좌표 p를 입력하세요");
		System.out.print("X 좌표 : "); double x = input.nextDouble();
		System.out.print("Y 좌표 : "); double y = input.nextDouble();
		Coordinate p = new Coordinate(x, y);
		
		System.out.println("좌표 q를 입력하세요");
		System.out.print("X 좌표 : "); x = input.nextDouble();
		System.out.print("Y 좌표 : "); y = input.nextDouble();
		Coordinate q = new Coordinate(x, y);
		
		System.out.println((p==q)?"p==q입니다.":"p!=q입니다");
		//생성된 객체의 주소가 같을리가 없지~ 무조건 P!=q이다.
		
		System.out.println(p.getX()==q.getX() && p.getY()==q.getY()?
				"p==q입니다.":"p!=q입니다");
		// 필드 값을 비교하는 것같다.
		
		System.out.println(compCoordinate(p, q)
				?"p==q입니다.":"p!=q입니다");
	}

}
