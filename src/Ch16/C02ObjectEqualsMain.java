package Ch16;

class C02Simple{
	int n;
	C02Simple(int n){
		this.n = n;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof C02Simple) {
			C02Simple down = (C02Simple)obj;
			return this.n==down.n;
		}
		return false;
	}
	
	
}

class B{
	
}

public class C02ObjectEqualsMain {

	public static void main(String[] args) {
		
		C02Simple ob1 = new C02Simple(10);
		C02Simple ob2 = new C02Simple(20);
		C02Simple ob3 = new C02Simple(10);
	
		
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.equals(ob3));
	}

}
