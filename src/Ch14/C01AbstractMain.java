package Ch14;

//일반클래스 상속관계
class Super1{
	void Func() {}
}

class Sub1 extends Super1{
	void Func() {System.out.println("Son1's Function..");}
}
//추상클래스 상속관계
abstract class Super2{
	abstract void Func();
}

class Sub2 extends Super2{
	void Func() {System.out.println("Son2's Function...");}
}

public class C01AbstractMain {

	public static void main(String[] args) {
		// 01 일반클래스 상세관계 확인
		Super1 ob1 = new Super1(); //상위클래스형 객체생성 o
		Sub1 ob2 = new Sub1(); //하위클래스형 객체생성 o 
		ob1.Func(); 		  // 상위클래스에서 하위클래스가 추가한 메서드 접근 x
		Super1 ob3 = ob2;	  // UPCASTING
		ob3.Func();           // 상위클래스에서 정의한 메서드를 하위클래스가 재정의(Overriding)한경우
							 // 하위클래스에서 재정의한 메서드 사용가능
		
		//02 추상클래스 상속관계 확인
		//Super2 ob4 = new Super2(); //상위클래스형 객체생성 x
		Sub2 ob5 = new Sub2();	   //하위클래스형 객체생성 o (단 추상메서드를 반드시 재정의 해야함)
		Super2 ob6 = ob5;	       //UPCASTING
		ob6.Func();	  			   //하위클래스가 재정의한 메서드에 접근가능

	}

}
