package problem1_13;

public class Human1Test {

	public static void main(String[] args) {
		Human1 gildong = new Human1("길동", 170, 63);
		Human1 chulsu = new Human1("철수", 166, 67);
		
		gildong.gainWeight(3);
		chulsu.gainWeight(5);
		
//		gildong.name = "ddd"; // 메소드로만 필드 접근이 가능함
		
		System.out.println("이름 : "+gildong.getName());
		System.out.println("신장 : "+gildong.getHeight());
		System.out.println("체중 : "+gildong.getWeight());
		System.out.println();
		
		System.out.println("이름 : "+chulsu.getName());
		System.out.println("신장 : "+chulsu.getHeight());
		System.out.println("체중 : "+chulsu.getWeight());
		System.out.println();
		
	}

}
