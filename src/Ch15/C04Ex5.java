package Ch15;

class Point {
	   private int x, y;
	   public Point(int x, int y) { this.x = x; this.y = y; }
	   public int getX() { return x; }
	   public int getY() { return y; }
	   protected void move(int x, int y) { this.x =x; this.y = y; }
}

//class ColorPoint extends Point{
//	String color;
//	
//	public ColorPoint(int x, int y, String color) {
//		super(x, y);
//		this.color = color;
//	}
//	
//	public void setColor(String color) {
//		this.color = color;
//	}
//	
//	public void setXY(int x, int y) {
//		move(x,y);
//	}
//
//	@Override
//	public String toString() {
//		return color + " 색의 " + "("+getX()+","+getY()+")의";
//	}
//}

class ColorPoint extends Point{
	String color;
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setXY(int x, int y) {
		move(x,y);
	}

	@Override
	public String toString() {
		return color + " 색의 " + "("+getX()+","+getY()+")의";
	}
}



public class C04Ex5 {

	public static void main(String[] args) {
//		   ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
//		   cp.setXY(10, 20);
//		   cp.setColor("RED");
//		   String str = cp.toString();
//		   System.out.println(str+" 점입니다. ");

//		   ColorPoint zeroPoint = new ColorPoint(); // (0,0) 위치의 BLACK 색 점
//		   System.out.println(zeroPoint.toString() + "입니다.");
//		   ColorPoint cp = new ColorPoint(10, 10); // (10,10) 위치의 BLACK 색 점
//		   cp.setXY(5,5);
//		   cp.setColor("RED");
//		   System.out.println(cp.toString()+"입니다.");
	}

}
