package ex13;

public class Humantester {

	public static void main(String[] args) {
		Human gildong = new Human("�浿", 170, 60);
		Human chulsu = new Human("ö��", 160, 50);
		
		
		gildong.gainWeight(3);
		chulsu.reduceWeight(3);
		
		System.out.println("�̸� : " + gildong.getName());
		System.out.println("���� : " + gildong.getHeight()+"cm");
		System.out.println("ü�� : " + gildong.getWeight()+"kg");
		System.out.println();
		
		System.out.println("�̸� : " + chulsu.getName());
		System.out.println("���� : " + chulsu.getHeight()+"cm");
		System.out.println("ü�� : " + chulsu.getWeight()+"kg");
	}

}
