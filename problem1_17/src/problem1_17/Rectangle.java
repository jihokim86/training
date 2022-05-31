package problem1_17;

public class Rectangle extends Shape{
	private int width; //사각형의 너비
	private int height; //사각형의 높이
	
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
