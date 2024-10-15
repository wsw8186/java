package Ch09;

class C01Person{
	private String name;
	private int age;
	private String addr;
	
	//constructor
	public C01Person(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	//getter and setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "C01Person [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
}

public class C01정보은닉 {

	public static void main(String[] args) {
		C01Person hong = new C01Person("홍길동",50,"대구");
		int age = hong.getAge();
		hong.setAddr("울산");
	}

}
