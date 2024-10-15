package Ch11;

class C02Simple{
	int n1;
	static int n2;
	
	void func1() {
		n1=10;
		n2=20;
	}
	static void func2() {
		n2=10;
		//n1=20; //접근불가 static은 만들어져있는데 n1은 객체가 선언될때(인스턴스) 생기기 때문
	}
}

public class C02StaticMain {

	public static void main(String[] args) {
		

	}

}
