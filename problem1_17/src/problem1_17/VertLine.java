package problem1_17;


//������ �����ϴ� Ŭ����
public class VertLine extends AbstLine{
	
	public VertLine(int length) {
		super(length);  // �θ�Ŭ�������� �ʱ�ȭ�� �����ٵ�?????
	}

	@Override
	public String toString() {
		return "VertLine(length:"+getLength()+")";
	}
	
	public void draw() {
		for(int i=1 ; i<getLength();i++) {
			System.out.println("|");
		}
	}
	
}
