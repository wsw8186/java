package Ch19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C05MapMain {
	//01 함수의 파라미터 형으로 사용되는 경우
	public static void func1(Map<String,Object> params){
		
	}
	//02 함수의 리턴형으로 사용되는 경우
	public static Map<String,Object> func2(){
		return null;
	}
	
	public static void main(String[] args) {
		Map<String,Object> map = new HashMap();
		String [] value = {"정보처리기사","빅데이터분석기사","네트워크 관리사","--"};
		map.put("자격증",value);
		List<String> hobby = new ArrayList();
		hobby.add("등산");
		hobby.add("독서");
		hobby.add("게임");
		map.put("취미",hobby);
		
		func1(map);
	}

}
