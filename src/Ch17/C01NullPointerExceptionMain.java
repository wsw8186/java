package Ch17;

public class C01NullPointerExceptionMain {

	public static void main(String[] args) {
		
		try {		
			String str = null;
			System.out.println(str.toString());
		}catch(NullPointerException e) {
//			System.out.println("예외객체 확인 : " + e);
//			System.out.println(e.getCause());
//			System.out.println(e.toString());
//			System.out.println(e.getStackTrace());
//			e.printStackTrace();
		}
		System.out.println("HELLOWORLD");

	}

}
