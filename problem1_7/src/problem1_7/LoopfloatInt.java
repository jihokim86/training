package problem1_7;

public class LoopfloatInt {

	public static void main(String[] args) {
		//0.0���� 1.0���� 0.001������ �������� ���� ǥ��
	System.out.println("float\t\tint");
	System.out.println("---------------------");
	
	float x = 0;
	for(float i =0; i<=1000;i++,x+=0.001f) {
		System.out.printf("%.7f  ,  %.7f\n",x,(float)i/1000);
	}
	}
}
