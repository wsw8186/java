package Ch06;

import java.util.Scanner;

public class C03SWITCH {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int  num = -1;
		while(true) {
			System.out.println("-------------MENU------------");
			System.out.println("1 도서 조회");
			System.out.println("2 도서 등록");
			System.out.println("3 도서 수정");
			System.out.println("4 도서 삭제");
			System.out.println("5 종료");
			System.out.println("-------------MENU------------");
			System.out.println("번호입력 : ");
			num =  sc.nextInt();
			switch(num) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					System.out.println("종료합니다");
					System.exit(-1);
				default :
					System.out.println("올바른 값을 입력하세요.");
			}
		}

	}

}
