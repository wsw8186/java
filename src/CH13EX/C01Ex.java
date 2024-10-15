package CH13EX;

//이것이자바다 상속문제 
//https://velog.io/@kaihojun/%EC%9D%B4%EA%B2%83%EC%9D%B4-%EC%9E%90%EB%B0%94%EB%8B%A4-%EA%B0%9C%EC%A0%95%ED%8C%90-7%EC%9E%A5-%EC%83%81%EC%86%8D-%ED%99%95%EC%9D%B8-%EB%AC%B8%EC%A0%9C-%ED%92%80%EC%9D%B4

//명품자바 상속문제
//https://cs-ssupport.tistory.com/84


//[1번] 다음 main() 메소드와 실행 결과를 참고하여 TV를 상속받은 ColorTV 클래스를 작성하라.

//출력 결과
//32인치 1024컬러
class TV{
	int size;
	TV(int size){
		this.size = size;
	}	
}
class ColorTV extends TV{
	int color;
	ColorTV(int size, int color){
		super(size);
		this.color = color;
	}
	public void printProperty() {
		System.out.println(size + "인치 " + color + "컬러");
	}
}
public class C01Ex {
	
	public static void main(String[] args) {
		   ColorTV myTV = new ColorTV(32, 1024);
		   ColorTV myTV2 = new ColorTV(16, 1024);
		   myTV.printProperty(); // 32인치 1024컬러 가 나오면 해결!
		   myTV2.printProperty(); // 32인치 1024컬러 가 나오면 해결!
	}
	
}

