package problem2_5;

public class WhileExample {

	public static void main(String[] args) {
		//���� ��ƾ�� ����Ͽ� 1~10���� ����ϵ��� �ϰ� ¦���� Ȧ���� ������ ���
		int count=1;
		
		while(true) {
			if(count%2 ==0) {
				System.out.print(count);
			}
			count++;
			if(count==10) {
				count =1;
				System.out.println();
				while(count<=10) {
					if(count%2 != 0) {
					System.out.print(count);
					}
					count ++;
				}
				break;
			}
		}
	}
}




