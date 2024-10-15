package Ch19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C02SetMain {
	public static void main(String[] args) {
		//set은 순서가없고 중복불가 기준점을 잡아서 순회시켜야하는데 그 기준이 iterator
		Set<String> set = new HashSet();
		set.add("HTML/CSS/JS");
		set.add("JQUERY");
		set.add("NODEJS");
		set.add("SCSS");
		set.add("REACT");
		set.add("JAVA");
		set.add("JSP/SERVLET");
		set.add("STS");
		set.add("SPRING BOOT");
		set.add("SPRING BOOT");
		//조회
		System.out.println("개수확인 : " + set.size());
		//삭제
		set.remove("STS");
		System.out.println("개수확인 : " + set.size());
		//전체조회(Iterator)
//		Iterator<String> iter = set.iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		} 1번쨰 방식 옛날
		for(String el : set)
			System.out.println(el);
		
		//전체삭제
		set.clear();
	
		
	}
}
