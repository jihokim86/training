package problem1_13;

public class Car {
	//이름,번호(Stirng)/ 폭, 높이 , 길이(int)/현재 위치 X표,Y좌표,탱크용량,남은 연료, 연비(double)
	//현재 위치 X,Y 좌표를 불러오기, 남은 연료 불러오기, 사양 표시하기, 지시한 X,Y방향만큼 자동차 이동하기, 급유하기
	
	//필드
	private String name;
	private String number;
	
	private int width;
	private int height;
	private int length;
	
	private double x;
	private double y;
	
	private double tankage;		//탱크 용량
	private double fuel;		//남은 용량
	private double sfc;			//연비
	
	//생성자
	Car(String name,String number,int width,int height,int length,
			double tankage,double fuel,double sfc){
		this.name = name;this.number = number;this.width=width; this.height=height;
		this.length=length; this.tankage=tankage; this.fuel=fuel; this.sfc=sfc;
		
		
	}
	
	//메소드
	//x,y 좌표 불러오기
	double getX() {
		return x;
	}
	double getY() {
		return y;
	}
	
	//남은 연료 불러오기
	double getFuel() {
		return fuel;
	}
	
	void putSpec() {
		System.out.println("이름 : "+name);
		System.out.println("번호 : "+number);
		System.out.println("전폭 : "+width+" mm");
		System.out.println("전고 : "+height+" mm");
		System.out.println("전장 : "+length+" mm");
		System.out.println("탱크 : "+tankage+" 리터");
		System.out.println("연비 : "+sfc+" km/리터");
	}
	
	//방향이동
	boolean move(double dx , double dy) {
		double dist = Math.sqrt(dx*dx+dy*dy);
		double f = dist/sfc;
		
		if(f>fuel) {
			return false;
		}else {
			fuel -= f;
			x += dx;
			y += dy;
			return true;
		}
	}
	
	void refuel(double df) {
		if(df>0) {
			fuel += df;
			if(fuel>tankage) {
				fuel = tankage;
			}
		}
	}
	
}
