
public class ShapeSet {

	static Shape[] shapes = new Shape[100];
	static int count;
	public static void add(Shape shape) {
		shapes[count++]=shape;
		
	}
	public void allShapeDraw() {
		for(int i=0; i<count; i++) {
			System.out.println(shapes[i].info());
		}
		
	}

}
