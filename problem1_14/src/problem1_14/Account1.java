package problem1_14;

public class Account1 {
	private String name;
	private String no;
	private long balance;
	private Day openDay;
	
	

	public Account1(String name, String no, long balance, Day openDay) {
		super();
		this.name = name;
		this.no = no;
		this.balance = balance;
		this.openDay = openDay;
	}

	public Day getOpenDay() {
		return new Day(openDay);
	}

	public String getName() {
		return name;
	}

	public String getNo() {
		return no;
	}

	public long getBalance() {
		return balance;
	}
	
	
	void deposit(long k) {
		balance += k;
	}
	void withdraw(long k) {
		balance -=k;
	}

	@Override
	public String toString() {
		return  "{"+name+","+no+","+balance+"}";
	}
	
}
