package problem1_7;

public class SquareFloat {

	public static void main(String[] args) {
		//0.0���� 1.0���� 0.001 ������ ������Ű�� ���� ǥ��(�ݺ��� float������ ����)
		System.out.println("x\tx������");
		System.out.println("-------------------");
		
		for(float i =0.0f; i<=1.0 ; i+=0.001) {
			System.out.printf("%.3f\t%.7f\n",i,i*i);
		}
	}

}
