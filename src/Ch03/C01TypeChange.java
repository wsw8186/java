package Ch03;

public class C01TypeChange {

	public static void main(String[] args) {
		//(자료형)형변환
		//연산작업시(=,+,-) 일치하지 않는 자료형을 일치시키는 작업

		//자동형변환(암시적형변환) : 컴파일러에 의해 자동으로 변환
		//강제형변환(명시적형변환) : 프로그래머에 의해 강제로 변환
		
		//자동형변환인경우 데이터 손실을 최소화 하는 방향으로 자료형이 일치
		//byte < short,char < int < long < float < double
		
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가 의 유니코드: " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);

	}

}
