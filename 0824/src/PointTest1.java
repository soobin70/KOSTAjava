class Point {
	int x;
	int y;
	public Point() {}
    public Point(int x, int y) {
   	 this.x=x;
   	 this.y=y;
    }

}

class MyClass{
	Point p;
	MyClass(){
		p = new Point(10,10);
	}
}
class YourClass extends MyClass{
	int x;
}
public class PointTest1 {

	public static void main(String[] args) {
		YourClass c = new YourClass();
		System.out.println(c.p.y);

	}

}
