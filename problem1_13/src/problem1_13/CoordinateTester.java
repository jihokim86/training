package problem1_13;

import java.util.Scanner;

public class CoordinateTester {
	public static void main(String[] args) {
	 
		Scanner input = new Scanner(System.in);
		
		System.out.println("좌표 p를 입력하세요.");
		System.out.print("X좌표 : "); double x = input.nextDouble();
		System.out.print("Y좌표 : "); double y = input.nextDouble();
		
		Coordinate2 p = new Coordinate2(x, y);
		System.out.println("p="+p); //toString 으로 인해 주소출력 안함
//		Coordinate2 q = new Coordinate2(p);
		Coordinate2 q=p;  //위와 동일 코드
		System.out.println(p + "          "+q);
		
		System.out.println("q와p를 동일 좌표로 만들었습니다.");
		System.out.println("q="+q);
		
		if(p.equals(q)) {
			System.out.println(p.equals(q)); // true
			System.out.println("p와 q가 같습니다.");
		}else {
			System.out.println("p와 q가 다릅니다.");
		}
		
		Coordinate2 c1 = new Coordinate2(); //
		Coordinate2 c2 = new Coordinate2(1.1,2.2);
		
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		Coordinate2[] a = new Coordinate2[3];
		for(int i=0; i<a.length;i++) {
			a[i]= new Coordinate2();
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.println("a["+i+"]="+a[i]);
		}
 }
}
