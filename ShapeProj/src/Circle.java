
public class Circle extends Shape {
	Point center = new  Point();
	
	int radius;
	
	public Circle() {}
	public Circle(String color, int x, int y, int radius) {
		super(color);
		this.center.x = x;
		this.center.y= y;
		this.radius = radius;
	}
	public Circle(String color, Point center, int radius) {
		super(color);
		this.center = center;
		this.radius = radius;
	}
	//[원:색(red),중심점(10,10),반지름(20)]

	@Override
	public String info() {
		// TODO Auto-generated method stub
		return String.format("원 : 색(%s),중심점(%d,%d),반지름(%d)",color, center.x,center.y, radius);
	}
}
