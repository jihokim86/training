package problem2_1;

public class TypeJava {

	public static void main(String[] args) {
		//java�� �ڷ����� �����ϰ� ���
		
		byte byteType = 100; 				//8 ��Ʈ ���� -128 ~ +127
		short shorType = 200;				//16��Ʈ ���� -32,768 ~ +32,767
		int intType = 1000000;				//32��Ʈ ���� -2,147,483,638~+2,147,483,647
		long longType = 1000000000L;		//64��Ʈ ����	-9,223,372,036,854,775,808~+9,223,372,036,854,775,807
		float floatType = 3.14246484513f;	//32��Ʈ �ε��Ҽ��� -3.402932347e+38~+3.40292347e+38
		double doubleType = 3.14246484513;	//64��Ʈ �ε��Ҽ��� -1.79769313486231570e+308~1.79769313486231570e+08
		char charType = '��';				//16��Ʈ �����ڵ�  ��\u0000�� ~ ��\uFFFF��
		boolean booleanType = true;			// true , false 
		
		System.out.println("java�� �ڷ����� �����ϰ� ���");
		System.out.println();
		System.out.println("byteType : "+ byteType);
		System.out.println("shorType : "+ shorType);
		System.out.println("intType : " +intType);
		System.out.println("longType : "+longType);
		System.out.println("floatType : "+floatType);
		System.out.println("doubleType : "+doubleType);
		System.out.println("charType : " +charType);
		System.out.println("blooleanType : "+ booleanType);
		
	}

}
