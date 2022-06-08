package problem2_1;

import java.util.Scanner;

public class dataRange {

	public static void main(String[] args) {
		//문자와 정수의 데이터 범위를 증명할 수 있는 프로그램을 작성
		//입력받은 문자와 정수가 범위 내에 있으면 그대로 출력하고 범위를 벗어나면 
		//오류문구를 출력
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("입력할 타입은 무엇인가요?");
		System.out.print("(1.byte / 2. short / 3.int / 4. long / 5. char) : ");
		int key = input.nextInt();
		
		switch (key) {
		case 1:
			System.out.print("정수 값을 입력하세요 :");
			long byteType = input.nextLong();
			if(byteType>Byte.MIN_VALUE && byteType<Byte.MAX_VALUE)
				System.out.println("입력한 정수값은 byte type "+byteType+" 입니다.");
			if(byteType<Byte.MIN_VALUE || byteType>Byte.MAX_VALUE)
				System.out.println("범위를 초과하였다!");
			break;
		case 2:
			System.out.print("정수 값을 입력하세요 :");
			long shortType = input.nextLong();
			if(shortType>Short.MIN_VALUE && shortType<Short.MAX_VALUE)
				System.out.println("입력한 정수값은 byte type "+shortType+" 입니다.");
			if(shortType<Short.MIN_VALUE || shortType>Short.MAX_VALUE)
				System.out.println("범위를 초과하였다!");
			break;
		case 3:
			System.out.print("정수 값을 입력하세요 :");
			long intType = input.nextLong();
			if(intType>Integer.MIN_VALUE && intType<Integer.MAX_VALUE)
				System.out.println("입력한 정수값은 byte type "+intType+" 입니다.");
			if(intType<Integer.MIN_VALUE || intType>Integer.MAX_VALUE)
				System.out.println("범위를 초과하였다!");
			break;
		case 4:
			System.out.print("정수 값을 입력하세요 :");
			long longType = input.nextLong();
			if(longType>Long.MIN_VALUE && longType<Long.MAX_VALUE)
				System.out.println("입력한 정수값은 byte type "+longType+" 입니다.");
			if(longType<Long.MIN_VALUE || longType>Long.MAX_VALUE)
				System.out.println("범위를 초과하였다!");
			break;
		case 5:
			System.out.print("문자를 입력하세요 :");
			char charType = input.next().charAt(0);
			if(charType> 0 && charType<65535)
				System.out.println("문자값은 char type '"+charType+"' 입니다.");
			if(charType<0 || charType>65535)
				System.out.println("범위를 초과하였다!");
			break;

		default:
			break;
		}
		input.close();
	}
}
