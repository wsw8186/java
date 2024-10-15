package Ch18;

class 시즈닝{
	
}

class 캬라멜 extends 시즈닝{
	@Override
	public String toString() {
		return "캬라멜";
	}
}

class 버터옥수수 extends 시즈닝{
	@Override
	public String toString() {
		return "버터옥수수";
	}
}

class PopCorn<T extends 시즈닝>{
	private T material;
	PopCorn(T material){
		this.material = material;
	}
	
	@Override
	public String toString() {
		return "팝콘 [material=" + material + "]";
	}
}


public class C02GenericMain {

	public static void main(String[] args) {
		PopCorn<캬라멜> ob1 = new PopCorn<캬라멜>(new 캬라멜());
		System.out.println(ob1);
		
		PopCorn<버터옥수수> ob2 = new PopCorn<버터옥수수>(new 버터옥수수());
		System.out.println(ob2);
	}

}
