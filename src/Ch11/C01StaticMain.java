package Ch11;

class C01Simple{
	static int num1; //공유메모리영역(클래스,메서드영역)에 할당
					 //객체생성과는 무관하게 사용가능(클래스명,static변수명)
	int num2; 
	
	C01Simple(){
		this.num1 = 0;
		this.num2 = 0;
	}

	@Override
	public String toString() {
		return "C01Simple [num1=" + num1 + " ,num2=" + num2 + "]";
	}
	
	
	
	
}


public class C01StaticMain {

	public static void main(String[] args) {
		C01Simple ob1 = new C01Simple();
		C01Simple ob2 = new C01Simple();
//		C01Simple.num1=100;
		ob1.num1=123;
		System.out.println("num1 : " + C01Simple.num1);
		System.out.println("ob1's num1 : " + ob1.num1);
		System.out.println("ob2's num1 : " + ob2.num1);

	}

}
