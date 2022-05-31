package problem1_15;

public  class Id {
	static int counter =0;
	private int id;
	
	// 생성자
	public Id() {
		id = ++counter;
	}
	
	// 식별 번호 가져오기
	public int getId() {
		return id;
	}
}
