package problem1_20;

public class PringAscii {

	public static void main(String[] args) {
		//����, ���ڿ� ��ȣ�� ���ڿ� ���� �ڵ�� ǥ��
		for(char i =0x21;i<0x7E;i++) {
			System.out.printf("%c %04x\n",i,(int)i);
		}
	}

}
