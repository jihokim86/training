package problem1_17;

public class Rectangle extends Shape{
	private int width; //�簢���� �ʺ�
	private int height; //�簢���� ����
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	

	@Override
	public void draw() {
		for(int i=1; i<=height;i++) {
			for(int j=1; j<=width;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	@Override
	public String toString() {
		return "Rectangle(width=" + width + ", height=" + height + ")";
	}
	
}
