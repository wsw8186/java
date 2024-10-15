package Ch19;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class C03Ex {
	public static void main(String[] args) {
		
		//1 ~ 45 까지숫자를 6개를 랜덤으로 받아(Random클래스를이용) set에 저장
		//[추가]저장된 set의 오름차순정렬을 해보세요(검색을통해서 해결해봅니다)
		
		Set<Integer> set = new HashSet();
		Random rnd = new Random();
		
		
        while (set.size() < 6) {
            int number = rnd.nextInt(45) + 1; 
            set.add(number);
        }
        
        System.out.println(set);

        set.stream().sorted().forEach(System.out::println);
		
		
	}
}
