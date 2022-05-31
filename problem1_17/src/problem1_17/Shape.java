package problem1_17;
/*
 * shape Ŭ������ ������ ������ ��Ÿ���� ���� �߻� Ŭ�����̴�.
 * �߻�Ŭ������ �� Ŭ������ �ν��Ͻ��� ������ �� ����.
 * �߻�Ŭ������ �̿ϼ��� Ŭ����. ����� ���� �ϼ��Ѵ�?
 */
public abstract class Shape {
	
	public abstract String toString();
	//������ ������ ��Ÿ���� ���ڿ��� ��ȯ�ϴ� �߻� �żҵ�
	
	public abstract void draw();
	//������ �׸��� ���� �߻� �޼ҵ�
	
	public void print() {
		System.out.println(toString());
		draw();
	}
	/*
	 * ���� ������ ǥ���ϰ� ���� ��ü�� �׸���.
	 * 1. toString �żҵ尡 ��ȯ�ϴ� ���ڿ��� ǥ���ϰ� �ٹٲ�
	 * 2. draw�żҵ带 ȣ���ؼ� ������ �׸�
	 */
	
}
