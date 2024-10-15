package Ch10;

public class C03다차원배열 {

	public static void main(String[] args) {
	
		int arr[][]= {
				{10,20,30,11,22},
				{40,50,60,33,44,55},
				{70,80,90,66,77,88,99},
				{100,110,120,12,13,44,55,66}
		};
		
		System.out.println("행의 길이 : " + arr.length);
		System.out.println("[0]행의 길이 : " + arr[0].length);
		System.out.println("[1]행의 길이 : " + arr[1].length);
		System.out.println("[2]행의 길이 : " + arr[2].length);
		System.out.println("[3]행의 길이 : " + arr[3].length);

	}

}
