package problem1_17;

public class HorzLine extends AbstLine{
	
	public HorzLine(int length) {
		super(length);  // �θ�Ŭ�������� �ʱ�ȭ�� �����ٵ�?????
	}

	@Override
	public String toString() {
		return "HorzLine(length:"+getLength()+")";
	} 
	//abstLine�� ��� �޾ұ⿡ getLength�޼ҵ� ����� ����
	
	//������ �ߴ� �żҵ�
	
	public void draw() {
		for (int i = 1; i < getLength(); i++) {
			System.out.print('-');
		}
		System.out.println();
	}

}
