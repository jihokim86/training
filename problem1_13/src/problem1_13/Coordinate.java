package problem1_13;

public class Coordinate {
	
	//필드
	private double x=0.0;
	private double y=0.0;
	
	//생성자
	Coordinate(double x, double y){
		this.x=x; this.y=y;
	}
	
	//매소드
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
