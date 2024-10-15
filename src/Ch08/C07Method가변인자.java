package Ch08;

class C07Simple{
	
	int sum(int ...arg) {
		for(int num : arg) {
			System.out.print(num + " ");
		}
		System.out.println();
		return 0;
	}
}



public class C07Method가변인자 {

	public static void main(String[] args) {
		
		C07Simple obj = new C07Simple();
		obj.sum(10);
		obj.sum(10,20);
		obj.sum(10,20,30);
		obj.sum(10,20,30,40);
		obj.sum(10,20,30,40,50);
		obj.sum(10,20,30,40,50,60);

	}

}
