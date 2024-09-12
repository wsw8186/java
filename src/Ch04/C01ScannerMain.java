package Ch04;

import java.util.Scanner;

public class C01ScannerMain {

	public static void main(String[] args) {
		
		// ctrl + shift + o : 자동 import
		// ctrl + shift + f : 정리
		
		// System.out : 표준출력 스트림
		// system.in : 표준입력 스트림
		
		// new Scanner(System.in)
		// 표준입력장치(키보드)로부터 전달되는 데이터를 받을수있는 Scanner객체를 생성
		// Scanner sc =  new Scanner(System.in)
		// Scanner객체를 main함수내에서 제어(접근,사용)할수 있도록 sc변수에 위치정보를 저장
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("입력 : ");
		int n1 = sc.nextInt();
//		System.out.printf("n1 : " + n1);
		
		int n2 = sc.nextInt();
//		System.out.printf("n2 : " + n2);
		
		int n3 = sc.nextInt();
//		System.out.printf("n3 : " + n3);
		
		int n4 = sc.nextInt();
//		System.out.printf("n4 : " + n4);
		
		System.out.printf("%d %d %d %d\n",n1,n2,n3,n4);
		
		

	}

}
