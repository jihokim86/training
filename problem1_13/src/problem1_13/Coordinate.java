package problem1_13;

public class Coordinate {
	
	//�ʵ�
	private double x=0.0;
	private double y=0.0;
	
	//������
	Coordinate(double x, double y){
		this.x=x; this.y=y;
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
	
}
