package problem1_14;

public class AccountTester1 {

	public static void main(String[] args) {
		Day d = new Day(2010,10,15);
		Account1 gildong = new Account1("�浿","125768",100,d);
		
		Day p = gildong.getOpenDay();
		System.out.println("���� ������:"+p);
		
		p.set(1999,12,31);
		
		Day q = gildong.getOpenDay();
		System.out.println("���� ������:"+q);
	}

}
