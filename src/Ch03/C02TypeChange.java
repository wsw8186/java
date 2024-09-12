package Ch03;

public class C02TypeChange {

	public static void main(String[] args) {
		//강제형변환
		//좁은범위공간에 큰범위안의 값을 넣으려고 하는 경우
		//데이터 손실 우려에 의해 컴파일러수준에서의 에러를 확인하게된다
		//이때 해당 오류를 무시하고 강제로 변환하는 작업

		
		int intValue = 44032;
		char charValue = (char)intValue;
		System.out.println((int)charValue);
		
		long longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		
		//데이터 손실!
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);
	}

}
