package problem1_17;


//������ ��Ÿ���� �߻� Ŭ����
public abstract class AbstLine extends Shape {
	private int length; // ������ ����

	public AbstLine(int length) {
//		this.length = length;// �����ڷ� �ȹ޴°ǰ�??
		setLength(length);  //������ �Ű������� set�Լ�����?? ����???
	}

	public int getLength() { //������ ���̸� ����
		return length;
	}
	
	public void setLength(int length) {  // setLength�Լ�,�Ű���������
		this.length = length;	// �����ڿ��� ȣ����, �ʵ尪�� �ٷ� ������ϴ� ������?
	}

	@Override // ���� ���� �ִ� ���ڿ��� ������.
	public String toString() {
		return "AbstLine (length=" + length + ")";
	}
	
	
	
}
