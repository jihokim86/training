package problem1_7;

public class SquareInt {

	public static void main(String[] args) {
		//0.0���� 1.0���� 0.001 ������ ������Ű�� ���� ǥ��(�ݺ��� int������ ����)
				System.out.println("x\tx������");
				System.out.println("-------------------");
				
				for(int i =0; i<=1000 ; i++) {
					float x = (float) i/1000;
					System.out.printf("%.3f\t%.7f\n",x,x*x);
				}
			}
	}


