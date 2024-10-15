package Ch19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01Ex {
	static Scanner sc = new Scanner(System.in);
	
	public static void func1(List<String> list) {
		//ArrayList에 있는 정수값을 입력받는데 전달되는 수중에
		//짝수의 값만 입력받는 코드를 작성하세요.
		//func3함수 완성하기	
		while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            try {
                if (Integer.parseInt(input) % 2 == 0) {
                    list.add(input); 
                }
            } catch (NumberFormatException e) {
                System.out.println("exit를 입력하거나 숫자를 입력해주세요");
            }
		}
		
	}
	public static List<String> func2(List<String> list) {
		//ArrayList에 있는 문자열 중에서 길이가 5보다 큰 문자열만 필터링해서 리턴하는 함수를 만드세요
		List<String> li2 = new ArrayList();
		for(String el : list){
			if(el.length()>5) {
				li2.add(el);
			}
		}
		
		return li2;
	}
	public static int func3(List<String> list) {
		//ArrayList에 있는 문자열 중에서 숫자형 데이터만 추출해서 합을 구해보세요
		int sum = 0;
		for(String el : list) {
			sum += Integer.parseInt(el);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		List<String> li = new ArrayList();
		func1(li);
		System.out.println(li);
		List<String> returndList =  func2(li);
		System.out.println("returndList : " + returndList);
		int sum =  func3(returndList);
		System.out.println(sum);
	}

}
