package Ch19;

import java.util.ArrayList;
import java.util.List;

public class C01ListMain {

	public static void main(String[] args) {
		//list는 순서가있고 중복가능 동적확장가능
		//set은 순서가없고 중복불가 기준점을 잡아서 순회시켜야하는데 그 기준이 iterator
		//map은 키와 값을 가져야함 
		
		List<String> list = new ArrayList();
		list.add("HTML/CSS/JS");
		list.add("JQUERY");
		list.add("NODEJS");
		list.add("SCSS");
		list.add("REACT");
		list.add("JAVA");
		list.add("JSP/SERVLET");
		list.add("STS");
		list.add("SPRING BOOT");
		list.add("SPRING BOOT");
		//조회
		System.out.println("개수확인 : " + list.size());
		System.out.println("idx로 조회 : " + list.get(2));
		System.out.println("Value로 idx확인 : " + list.indexOf("JAVA"));
		//삭제
		list.remove(0);
		list.remove("JQUERY");
		for(String el : list)
			System.out.println(el);
		//전체 삭제
		list.clear();
		
	}

}
