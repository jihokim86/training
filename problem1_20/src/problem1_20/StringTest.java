package problem1_20;

public class StringTest {

	public static void main(String[] args) {
		//���ڿ��� null����, �� ���ڿ�, �ٸ� String �� ������ �����ϴ� ���ڿ��� ����
		String s1 = null; //�����ϴ� ��ü�� ����
		String s2 = ""; // ""�� ã��
		String s3 = "ABC";
		String s4 = "ABC";
		String s5 = "ABC";
		s5 = "XYZ";
		
		System.out.println(s1); //null
		System.out.println(s2); //
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5); // XYZ
		
		System.out.println(s3==s4); // true
		
		String a = "ABC";
		String b = "ABC"+a;
		String c = "ABC"+a;
		System.out.printf("%s   || %s \n",b,c); //ABCABC || ABCABC
		System.out.println(b==c); // false
		// ���� b�� ����c�� ���������� ��������⿡ ������ü�� �ٸ���!!!??
	
	}

}
