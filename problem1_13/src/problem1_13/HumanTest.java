package problem1_13;

public class HumanTest {

	public static void main(String[] args) {
		Human gildong = new Human(); // �浿 ��ü����
		Human chulsu = new Human(); // ö�� ��ü����
		
		gildong.name = "�浿";
		gildong.height = 170;
		gildong.weight = 60;
		
		chulsu.name = "ö��";
		chulsu.height = 166;
		chulsu.weight= 75;
		
		System.out.println("�̸� : "+gildong.name);
		System.out.println("���� : "+gildong.height+"cm");
		System.out.println("ü�� : "+gildong.weight+"kg");
		
		System.out.println("�̸� : "+chulsu.name);
		System.out.println("���� : "+chulsu.height+"cm");
		System.out.println("ü�� : "+chulsu.weight+"kg");
		
	}

}
