package problem1_14;

public class HumanTester {

	public static void main(String[] args) {
		Human2 gildong = new Human2("길동", 170, 60 );
		Human2 chulsu = new Human2("철수", 166, 72);
		
		
		gildong.putData();
		
		System.out.println("번호:"+gildong.getIn());
		System.out.println();
		
		chulsu.putData();
		System.out.println("번호:"+chulsu.getIn());
	}
}
