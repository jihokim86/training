package problem2_1;

public class MathmethodExample {

	public static void main(String[] args) {
		//Math �޼ҵ带 �����غ��ÿ�
		
		int num1 = 250;
		int num2 = 3;
		double result = (double)num1/num2; //83.33333333333 double�� ����ȯ�� �ʿ�
		double result1 = num1/num2; // ������� int������ ����ȴ�.
		
		System.out.println(result1); //83.0
		System.out.println("�ݿø� round : "+Math.round(result));				// 83 , round = �ݿø� �׻� �Ҽ��� 1° �ڸ����� �ݿø�
		System.out.println("�ݿø� round : "+Math.round(result*10)/10.0);		// 83.3 , round = �ݿø� �׻� �Ҽ��� 2° �ڸ����� �ݿø�
		System.out.println("�ø� �� ceil : "+Math.ceil(result));				//84.0 , ceil = �ø� 
		System.out.println("�ŵ����� �� pow : " +Math.pow(num2, 2));			//9.0 , pow(num2,����), ��,����� double��
		System.out.println("���� �� floor : " +Math.floor(result));			//83.0 , floor= ����
		System.out.println("���밪 : " +Math.sqrt(result));					//9.1287..,sqrt = ������
		System.out.println("�������� : "+ (int)(Math.random()*45+1));			//1~45 ����(����) ���� ����
		
	}
}
