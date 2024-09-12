package Ch04;

import java.util.Scanner;

public class C03ScannerMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 :");
		String str2 = sc.nextLine();
		
		System.out.print("홍길동 님의 나이를 입력하세요 :");
		int n1 = sc.nextInt();
		
		sc.nextLine();
		System.out.print("주소를 입력하세요 :");
		String str3 = sc.nextLine();
		
		System.out.println(str2 + " 님의 나이는 " + n1 + " 주소는 " + str3 + " 입니다" );
		

	}

}
