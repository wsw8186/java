package Ch14;


abstract class 문방구{
	
	abstract void 쓰기();
}
class 샤프 extends 문방구{

	@Override
	void 쓰기() {
		System.out.println("샤프로 씁니다");
	}
	
}
class 볼펜 extends 문방구{

	@Override
	void 쓰기() {
		System.out.println("연필로 씁니다");
	}	
}

public class C02AbstractMain {
	
	public static void writing(문방구 tool) {
		tool.쓰기();
	}
	
	public static void main(String[] args) {
		writing(new 볼펜());
		writing(new 샤프());
	}
}






