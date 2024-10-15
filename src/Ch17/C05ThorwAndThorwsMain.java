package Ch17;

class A{
	public void Ex1() throws NullPointerException{
		throw new NullPointerException("NULL EXCEPTION....");
	}
}

class B{
	public void Ex2(A a) throws NullPointerException{
//		try {			
			a.Ex1();
//		}catch(NullPointerException e) {
//			System.out.println("Ex2 에서 예외처리..");
//		}		
	}
}

public class C05ThorwAndThorwsMain {

	public static void main(String[] args) {
		System.out.println("실행코드 1");
		System.out.println("실행코드 2");
		A a = new A();
		B b = new B();
		try {			
			b.Ex2(a);
		}catch(Exception e) {
			System.out.println("Main 에서 예외처리");
		}
		System.out.println("실행코드 3");

	}

}
