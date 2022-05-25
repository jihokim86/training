package problem1_13;

public class Coordinate2 {
	//�ʵ�
	private double x=0.0;
	private double y=0.0;
	
	//������
	public Coordinate2(){
	}
	public Coordinate2(double x, double y) {
		set(x,y);
	}
	public Coordinate2(Coordinate2 c) {
		this(c.x, c.y);
	}
	
	
	//�żҵ�
	double getX() {
		return x;
	}
	double getY() {
		return y;
	}
	
	void setX(double x) {
		this.x=x;
	}
	void setY(double y) {
		this.y=y;
	}
	
	void set(double x, double y) {
		this.x=x; this.y=y;
	}
	
	public boolean equalTo(Coordinate2 c) {
		return x==c.x && y==c.y;
		}
	public String toString() {
		return "("+x+","+y+")";
	}
}
