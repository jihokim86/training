package problem1_17;

public class Point extends Shape{
	
	public Point() { //�⺻ ������ �ϱ�??
	}

	@Override // Ŭ���� ȣ��� point ������!
	public String toString() {
		return "Point";
	}
	
	@Override// ���� �׸��� �żҵ�
	public void draw() {
		System.out.println('+');
	}
	
	
}
