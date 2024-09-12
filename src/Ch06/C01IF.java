package Ch06;

import java.util.Scanner;

public class C01IF {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이 : ");
//		int age = sc.nextInt();
//		if(age >= 8)
//			System.out.println("학교에 다닙니다");
//		System.out.println("첫번째 IF 블럭 종료");
//		if(age < 8)
//			System.out.println("학교에 다니지 않습니다");
//		
//		System.out.println("두번째 IF 블럭 종료");
//		System.out.println("프로그램을 종료합니다");
		
		
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이 : ");
//		int age = sc.nextInt();
//		if(age >= 8)
//			System.out.println("학교에 다닙니다");
//		else
//			System.out.println("학교에 다니지 않습니다");
//		
//		System.out.println("두번째 IF 블럭 종료");
//		System.out.println("프로그램을 종료합니다");
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("입력 : ");
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
//		if(num%3==0) {
//			System.out.println(num + "은 3의 배수 입니다");
//		}
//		if(num%3==0 && num%5==0) {
//			System.out.println(num + "은 3의 배수이면서 5의 배수 입니다");
//		}
		
//		if(num%3==0){
//			if(num%5==0) {
//				System.out.println(num + "은 3의 배수이면서 5의 배수 입니다");
//			}else {
//				System.out.println(num + "은 3의 배수 입니다");		
//			}
//		}
//		
//		if(num%3==0 && num%5==0) {
//			System.out.println(num + "은 3의 배수이면서 5의 배수 입니다");
//		}else {
//			if(num%3==0) {
//				System.out.println(num + "은 3의 배수 입니다");	
//			}
//		}
		
//		if(num>num2) {
//			System.out.println(num + "이 더 큰 수입니다");
//		}else {
//			System.out.println(num2 + "이 더 큰 수입니다");
//		}
		
//		int add = num+num2+num3;
//		int ave = (num+num2+num3)/3;
//		
//		System.out.println(add);
//		System.out.println(ave);
		
//		if(num>num2) {
//			if(num>num3) {
//				System.out.println(num + "이 제일 큽니다");
//			}else {
//				System.out.println(num3 + "이 제일 큽니다");
//			}
//		}else {
//			if(num2>num3) {
//				System.out.println(num2 + "이 제일 큽니다");
//			}else {
//				System.out.println(num3 + "이 제일 큽니다");
//			}
//		}
		
		
		// IF ELSEIF
		int 과목1 = sc.nextInt();
		int 과목2 = sc.nextInt();
		int 과목3 = sc.nextInt();
		int 과목4 = sc.nextInt();
		double 평균 = (double)(과목1+과목2+과목3+과목4)/4;
		
		if(과목1<40) {
			System.out.println("불합격");
		}else if(과목2<40) {
			System.out.println("불합격");
			
		}else if(과목3<40) {
			System.out.println("불합격");
			
		}else if(과목4<40) {
			System.out.println("불합격");
			
		}else if(평균 <60) {
			System.out.println("붋합격");
		}else {
			System.out.println("합격");
		}
		
		
		
		
		
	}
	
}
