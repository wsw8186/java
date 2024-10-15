package Ch07;

import java.util.Scanner;

public class C01WHILE {

	public static void main(String[] args) {
		
		//01 while 기본
		//while(조건식){
		//조건식이 참인 경우 실행되는 종속 문장(1개의 행일때는 생략가능)
		//}

		//탈출용 변수
		//탈출을 위한 조건식
		//탈출을  위한 연산식

//		int i = 0; //탈출용 변수
//		while(i<5) { //탈출을 위한 조건식
//			System.out.println("HELLO WORLD");	
//			i++; //탈출을 위한 연산식
//		}
		
		//02 1-10까지 합
//		int i=1;
//		int sum=0;
//		while(i<=10) {
//			System.out.println("i : " + i);
//			sum+=i;
//			i++;
//		}
//		System.out.println("sum : " + sum);
		
		Scanner sc = new Scanner(System.in);
//		int end = sc.nextInt();
//		
//		int i=1;
//		int sum=0;
//		while(i<=end) {
//			System.out.println("i : " + i);
//			sum+=i;
//			i++;
//		}
//		System.out.println("sum : " + sum);

//		int i = sc.nextInt();
//		int end = sc.nextInt();
//		
//		int sum=0;
//		while(i<=end) {
//			System.out.println("i : " + i);
//			sum+=i;
//			i++;
//		}
//		System.out.println("sum : " + sum);
		
		//03
//		int n = sc.nextInt();
//		int i = 1;
//		int oddSum = 0;
//		int evenSum = 0;
//		while(i<=n) {
//			if(i%2==0) {
//				System.out.printf("%d 는 짝수\n", i);
//				evenSum+=i;
//			}else {
//				System.out.printf("%d 는 홀수\n", i);
//				oddSum+=i;
//			}
//			i++;
//		}
//		
		
		//06
//		int i =1;
//		while(i<=9) {
//			System.out.printf("%d x %d = %d\n",2,i,2*i);
//			i++;
//		}
		
		//07
		int n = sc.nextInt();
		while(n>9) {
			System.out.println("잘못 입력하셨습니다. 다시입력하세요.");
			n = sc.nextInt();
		}	
		
		int i =1;
		while(i<=9) {
			System.out.printf("%d x %d = %d\n",n,i,n*i);
			i++;
		}
		
		
		
		
		
		
	}	
}
