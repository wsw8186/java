package Ch18;

class Animal{}

class Tiger extends Animal{
	String name;
	
	public Tiger(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Tiger [name=" + name + "]";
	}
	
}

class Panda extends Animal{
	String name;
	
	public Panda(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Panda [name=" + name + "]";
	}
}

class Cat extends Animal{
	String name;
	
	public Cat(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + "]";
	}
}

public class C04GenericMain {
	// Generic 은 여러가지 다양한 객체를 못받아냄
	public static <T extends Animal> void PrintInfo(T[] arr) {
		for(T el : arr)
			System.out.println(el);
	}
	// 업캐스팅해서받은경우 다양한 객체를 받아낼수있으나 다운캐스팅이 필요함
	public static void PrintInfo2(Object[] arr) {
		for(Object el : arr) {
			System.out.println(el);
		}
	}
	
	public static void main(String[] args) {
		Tiger[] arr1 = {new Tiger("시베리안"), new Tiger("뱅갈"), new Tiger("백두산")};
		PrintInfo(arr1);
		Panda[] arr2 = {new Panda("중국"), new Panda("래서판더"), new Panda("팬더팬더")};
		PrintInfo(arr2);
		System.out.println("---------------");
		Object[] arr3 = {new Tiger("시베리안"),new Panda("래서팬더"), new Cat("먼치킨")};
		PrintInfo2(arr3);

	}

}
