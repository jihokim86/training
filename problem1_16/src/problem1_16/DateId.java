package problem1_16;

import java.util.GregorianCalendar;

public class DateId {
	private static int counter;
	private int id;
	
	static {
		GregorianCalendar today = new GregorianCalendar();
		int y = today.get(YEAR);
		int m = today.get(MONTH)+1;
		int d = today.get(DATE);
		
		System.out.printf("������ %04d�� %02d���Դϴ�.\n",y,m,d);
		
		counter = y*1000000+m*10000+d*100;
	}
	
	public DateId() {
		id = ++counter;
	}
	
	public int getId() {
		return id;
	}
}
