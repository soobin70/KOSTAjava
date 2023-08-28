
public class Rectangle extends Shape {
	Point starPos = new Point();
	int width;
	int height;
		public Rectangle() {}
		public Rectangle(String color, int x1, int y1, int width, int height) {
			super(color);
			this.starPos.x = x1;
			this.starPos.y= y1;
			this.width= width;
			this.height=height;
			
		

	}
		public Rectangle(String color, Point starPos, int width, int height) {
			super(color);
			this.starPos=starPos;
			this.width= width;
			this.height=height;
		

	}
		@Override
		public String info() {
			
			return String.format("사각형:색(%s),시작점(%d,%d), 너비(%d),높이(%d)",color,starPos.x,starPos.y,width,height);
		}

}
