package Ch17;

public class C04ExceptionMain {

	public static void main(String[] args) {
		
		try {
			String str = null;
			str.toString();				//NULL 예외발생
	
			int arr[] = {10,20,30};	
			arr[5] = 100;				//Bound Exception 발생
			Integer.parseInt("a1234");	//Parse Exception 발생
			
			Animal animal = new Dog();
			Cat yummi = (Cat)animal;	//Cast Exception;
		}
		catch(Exception e) {
			System.out.println("예외발생 : " + e);
		}finally {
			System.out.println("실행되어야할 코드");
		}
	}

}
