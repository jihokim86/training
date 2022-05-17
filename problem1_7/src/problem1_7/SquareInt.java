package problem1_7;

public class SquareInt {

	public static void main(String[] args) {
		//0.0부터 1.0까지 0.001 단위로 증가시키며 제곱 표시(반복을 int형으로 제어)
				System.out.println("x\tx의제곱");
				System.out.println("-------------------");
				
				for(int i =0; i<=1000 ; i++) {
					float x = (float) i/1000;
					System.out.printf("%.3f\t%.7f\n",x,x*x);
				}
			}
	}


