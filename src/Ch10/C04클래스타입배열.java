package Ch10;

class C04Person{
	String name;
	int age;
	
	public C04Person() {}
	public C04Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	@Override
	public String toString() {
		return "C04Person [name=" + name + ", age=" + age + "]";
	}
}



public class C04클래스타입배열 {

	public static void main(String[] args) {
		C04Person list[] = new C04Person[3];
		
		list[0] = new C04Person("홍길동",55);
		
		list[1] = new C04Person("김영희",35);
		
		list[2] = new C04Person("김범수",40);
		
	
		
		for(C04Person obj : list) {
			System.out.println(obj);
		}

	}

}
