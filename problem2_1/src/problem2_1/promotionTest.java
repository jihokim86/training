package problem2_1;

public class promotionTest {
	
	public static void main(String[] args) {
	// ������ ��ȯ 4������ ����� ���
	// byte < short < int < long < float < double
	
	long a = 127;
	int b = (int)a; 				// long Ÿ�� -> int Ÿ��
	short c = (short)a;				// long Ÿ�� -> shortŸ��
	byte d = (byte)a;				// long Ÿ�� -> byte Ÿ��
	String str = "127";		
	int e = Integer.parseInt(str);	// String Ÿ�� -> int Ÿ�� (���ڸ� ����)
	
	System.out.println("long type : " + a);
	System.out.println("long -> int  : " + b);
	System.out.println("long -> short : " + c);
	System.out.println("long -> byte : " + d);
	System.out.println("String -> int : " + e);
	}
}
