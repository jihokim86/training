package problem1_15;

public  class Id {
	static int counter =0;
	private int id;
	
	// ������
	public Id() {
		id = ++counter;
	}
	
	// �ĺ� ��ȣ ��������
	public int getId() {
		return id;
	}
}
