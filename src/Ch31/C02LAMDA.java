package Ch31;

interface Printer{
//	void print(String message);
	String print(String message);
//	String print();
}

public class C02LAMDA {

	public static void main(String[] args) {
		//01
//		Printer printer = (message)->{System.out.println(message);};
//		printer.print("HELLOWORLD");
		
		//02
//		Printer printer = (message)->{
//			return message;
//		};
//		String msg = printer.print("TEST");
//		System.out.println(msg);
		
		Printer printer = (message)->message+"!!!";
		String msg = printer.print("TEST");
		System.out.println(msg);
		
		
	}

}
