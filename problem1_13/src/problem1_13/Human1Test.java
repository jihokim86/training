package problem1_13;

public class Human1Test {

	public static void main(String[] args) {
		Human1 gildong = new Human1("�浿", 170, 63);
		Human1 chulsu = new Human1("ö��", 166, 67);
		
		gildong.gainWeight(3);
		chulsu.gainWeight(5);
		
//		gildong.name = "ddd"; // �޼ҵ�θ� �ʵ� ������ ������
		
		System.out.println("�̸� : "+gildong.getName());
		System.out.println("���� : "+gildong.getHeight());
		System.out.println("ü�� : "+gildong.getWeight());
		System.out.println();
		
		System.out.println("�̸� : "+chulsu.getName());
		System.out.println("���� : "+chulsu.getHeight());
		System.out.println("ü�� : "+chulsu.getWeight());
		System.out.println();
		
	}

}