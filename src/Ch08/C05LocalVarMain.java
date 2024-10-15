package Ch08;

// 변수 종류

//멤버변수: 클래스 내의 멤버로 사용되는 변수 (속성 저장)
//지역변수: {}내에서 선언되는 변수, {}를 벗어난다면 공간 반환, 변수명중복시 좁은 지역의 변수가 적용
//        매개변수,멤버변수,일반변수
//전역변수: static 변수

class C05Simple{
	int num=5; // 멤버변수
	void Func1() {
		System.out.println(num); //멤버변수 num
		int num=10; 			 //Func1 지역의 num
		System.out.println(num); //Func1 지역의 num
	}
	void Func2() {
		System.out.println(num); //멤버변수 num
		if(true) {
			int num =20;
			System.out.println(num); //if 지역내의 num
		}
		System.out.println(num); //멤버변수 num
		
		while(num<10) { //멤버변수 num
			int num = 20; //지역변수 num
			num++;
		}
	}
	void Func3(int num) {
		num++;
		this.num++;
	}
}


public class C05LocalVarMain {

	public static void main(String[] args) {
		

	}

}
