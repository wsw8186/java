package Ch31;

import java.util.ArrayList;
import java.util.List;

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

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

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}		
}

public class C01LAMDA {

	public static void main(String[] args) {
		
		List<Person> list = new ArrayList();
		list.add(new Person("홍길동",55));
		list.add(new Person("남길동",45));
		list.add(new Person("서길동",35));
		
		list.sort((a,b)->{return a.getAge()-b.getAge();});

		for(Person person : list) {
			System.out.println(person);
		}
		
	}

}
