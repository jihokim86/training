package problem2_1;

public class MathmethodExample {

	public static void main(String[] args) {
		//Math 메소드를 응용해보시오
		
		int num1 = 250;
		int num2 = 3;
		double result = (double)num1/num2; //83.33333333333 double로 형변환이 필요
		double result1 = num1/num2; // 결과값은 int형으로 저장된다.
		
		System.out.println(result1); //83.0
		System.out.println("반올림 round : "+Math.round(result));				// 83 , round = 반올림 항상 소수점 1째 자리에서 반올림
		System.out.println("반올림 round : "+Math.round(result*10)/10.0);		// 83.3 , round = 반올림 항상 소수점 2째 자리에서 반올림
		System.out.println("올림 값 ceil : "+Math.ceil(result));				//84.0 , ceil = 올림 
		System.out.println("거듭제곱 값 pow : " +Math.pow(num2, 2));			//9.0 , pow(num2,제곱), 입,출력이 double형
		System.out.println("내림 값 floor : " +Math.floor(result));			//83.0 , floor= 내림
		System.out.println("절대값 : " +Math.sqrt(result));					//9.1287..,sqrt = 제곱근
		System.out.println("랜덤숫자 : "+ (int)(Math.random()*45+1));			//1~45 숫자(정수) 랜덤 생성
		
	}
}
