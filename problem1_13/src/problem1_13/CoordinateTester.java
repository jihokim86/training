package problem1_13;

import java.util.Scanner;

public class CoordinateTester {
	public static void main(String[] args) {
	 
		Scanner input = new Scanner(System.in);
		
		System.out.println("��ǥ p�� �Է��ϼ���.");
		System.out.print("X��ǥ : "); double x = input.nextDouble();
		System.out.print("Y��ǥ : "); double y = input.nextDouble();
		
		Coordinate2 p = new Coordinate2(x, y);
		System.out.println("p="+p); //toString ���� ���� �ּ���� ����
//		Coordinate2 q = new Coordinate2(p);
		Coordinate2 q=p;  //���� ���� �ڵ�
		System.out.println(p + "          "+q);
		
		System.out.println("q��p�� ���� ��ǥ�� ��������ϴ�.");
		System.out.println("q="+q);
		
		if(p.equals(q)) {
			System.out.println(p.equals(q)); // true
			System.out.println("p�� q�� �����ϴ�.");
		}else {
			System.out.println("p�� q�� �ٸ��ϴ�.");
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