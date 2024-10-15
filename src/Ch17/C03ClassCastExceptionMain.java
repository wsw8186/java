package Ch17;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

public class C03ClassCastExceptionMain {
	
	public static void changeDog(Animal animal) {
		try {
			Dog down = (Dog)animal;
			System.out.println("DownCasting Sucess...");
		}catch(ClassCastException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Animal poppi = new Dog();
		Animal tori = new Cat();
		
		changeDog(tori);
		changeDog(poppi);
	}
}
