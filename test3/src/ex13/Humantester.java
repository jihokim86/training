package ex13;

public class Humantester {

	public static void main(String[] args) {
		Human gildong = new Human("길동", 170, 60);
		Human chulsu = new Human("철수", 160, 50);
		
		
		gildong.gainWeight(3);
		chulsu.reduceWeight(3);
		
		System.out.println("이름 : " + gildong.getName());
		System.out.println("신장 : " + gildong.getHeight()+"cm");
		System.out.println("체중 : " + gildong.getWeight()+"kg");
		System.out.println();
		
		System.out.println("이름 : " + chulsu.getName());
		System.out.println("신장 : " + chulsu.getHeight()+"cm");
		System.out.println("체중 : " + chulsu.getWeight()+"kg");
	}

}
