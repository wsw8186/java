package Ch08;


// 생성자메서드
// 객체 생성시 필요한 메모리공간형성과 초기값 부여에 사용되는 메서드
// 객체 생성시 한번 호출되는 메서드(재사용 불가)
// 생성자메서드의 이름은 클래스의 이름과 동일하게 작성/ 반환자료형은 작성하지 않는다
// 생성자메서드를 클래스 내에 작성하지 않으면 컴파일러에 의해 주입되는 생성자가 있는데
// 이를 디폴트 생성자라고 한다
// 디폴트 생성자는 모든 멤버변수에 초기값을 0(or false or null) 지정


class C08Simple{
	//속성
	int n1;
	double n2;
	boolean n3;
	String n4;
	//기능(생성자)
	C08Simple(){
		System.out.println("C08Simple() 호출!");
		this.n1=100; this.n2=200.2;this.n3=true;this.n4="HI";
	}
	C08Simple(int n1){
		System.out.println("C08Simple(int n1) 호출!");
		this.n1 = n1;
	}
	C08Simple(int n1,double n2){
		System.out.println("C08Simple(int n1,double n2) 호출!");
		this.n1 = n1;
		this.n2 = n2;
	}
	C08Simple(double n2,int n1){
		System.out.println("C08Simple(int n1,double n2) 호출!");
		this.n1 = n1;
		this.n2 = n2;
	}
	C08Simple(int n1,double n2,boolean n3){
		System.out.println("C08Simple(int n1,double n2,boolean n3) 호출!");
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
	public C08Simple(int n1, double n2, boolean n3, String n4) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.n4 = n4;
	}
	@Override
	public String toString() {
		return "C08Simple [n1=" + n1 + ", n2=" + n2 + ", n3=" + n3 + ", n4=" + n4 + "]";
	}	

}
public class C08ConstructorMain {

	public static void main(String[] args) {
		C08Simple ob = new C08Simple();
		C08Simple ob2 = new C08Simple(111);
		C08Simple ob3 = new C08Simple(111,222.4);
		C08Simple ob4 = new C08Simple(111,222.4,false);
		System.out.println(ob);
		System.out.println(ob2);
		System.out.println(ob3);
		System.out.println(ob4);
	}
}
