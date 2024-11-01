package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 문제1 {
	
	private static Scanner sc = new Scanner(System.in);
	private static List<String> wordList =new ArrayList<String>();
	
	public static void sort(boolean isAsend) {
		  if (isAsend) { //isAsend가 true일 경우
	            Collections.sort(wordList); // 리스트 정렬(오름차순 정렬)
	        } else { //isAsend가 false일 경우
	            Collections.sort(wordList, Collections.reverseOrder()); // 내림차순 정렬
	        }
	}
	public static void add(String word) {
		wordList.add(word); // 입력된 단어를 리스트에 추가
	}
	public static void show() {
		wordList.forEach(item -> System.out.println(item));  // 리스트의 각 항목을 출력
	}
	

	public static void main(String[] args) {
		int n = 0;
		while (true) {
			System.out.println("------------M E N U------------");
			System.out.println("1 추가");
			System.out.println("2 정렬");
			System.out.println("3 확인");
			System.out.println("4 죵료");
			System.out.println("------------M E N U------------");
			System.out.print("번호 : ");
			n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.print("단어 입력 : ");
				String word = sc.next();
				add(word);
				break;
			case 2:
				System.out.print("오름차순 여부(1:오름차순,0:내림차순) : ");
				int no = sc.nextInt();
				if(no==1) sort(true); else sort(false);
				
				break;
			case 3:
				show();
				break;
			case 4:
				System.out.println("종료합니다");
				System.exit(-1);
				break;
			default:
				System.out.println("다시입력 하세요");
			}
		}
	}
}
