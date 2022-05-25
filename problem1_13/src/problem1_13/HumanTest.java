package problem1_13;

public class HumanTest {

	public static void main(String[] args) {
		Human gildong = new Human(); // 길동 객체생성
		Human chulsu = new Human(); // 철수 객체생성
		
		gildong.name = "길동";
		gildong.height = 170;
		gildong.weight = 60;
		
		chulsu.name = "철수";
		chulsu.height = 166;
		chulsu.weight= 75;
		
		System.out.println("이름 : "+gildong.name);
		System.out.println("신장 : "+gildong.height+"cm");
		System.out.println("체중 : "+gildong.weight+"kg");
		
		System.out.println("이름 : "+chulsu.name);
		System.out.println("신장 : "+chulsu.height+"cm");
		System.out.println("체중 : "+chulsu.weight+"kg");
		
	}

}
