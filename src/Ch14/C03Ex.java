package Ch14;

abstract class Shape{
	 abstract void 넓이();
}
class Rectangle extends Shape{
	int width;
	int height;
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	void 넓이() {
		System.out.println("사각형의 넓이는 " + width*height + "입니다");
	}
	
}
class Triangle extends Shape{
	int height;
	int bottomLine;
	
	public Triangle(int height, int bottomLine) {
		super();
		this.height = height;
		this.bottomLine = bottomLine;
	}

	@Override
	void 넓이() {
		System.out.println("삼각형의 넓이는 " + height*bottomLine/2 + "입니다");
	}
}
class Circle extends Shape{
	int radius;
	static final double PI=3.14;
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	void 넓이() {
		System.out.println("원의넓이는 " + radius*radius*PI + "입니다");
	}


}
public class C03Ex {
	public static void 전체넓이확인(Shape shape) 
	{
		//넓이 출력	
		shape.넓이();
	}
	
	public static void main(String[] args) {
		전체넓이확인(new Rectangle(45,45));
		전체넓이확인(new Triangle(100,20));
		전체넓이확인(new Circle(5));
	}
}
