package problem1_14;

public class HumanTester {

	public static void main(String[] args) {
		Human2 gildong = new Human2("�浿", 170, 60 );
		Human2 chulsu = new Human2("ö��", 166, 72);
		
		
		gildong.putData();
		
		System.out.println("��ȣ:"+gildong.getIn());
		System.out.println();
		
		chulsu.putData();
		System.out.println("��ȣ:"+chulsu.getIn());
	}
}
