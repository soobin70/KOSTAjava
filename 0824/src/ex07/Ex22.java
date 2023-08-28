package ex07;

abstract class Shape {
   Point p;

   Shape() {
      this(new Point(0, 0));
   }

   Shape(Point p) {
      this.p = p;
   }

   abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드

   Point getPosition() {
      return p;
   }

   void setPosition(Point p) {
      this.p = p;
   }
}

class Point {
   int x;
   int y;

   Point() {
      this(0, 0);
   }

   Point(int x, int y) {
      this.x = x;
      this.y = y;
   }

   public String toString() {
      return "[" + x + "," + y + "]";
   }
}
class Circle extends Shape{
   double r;
   
   Circle(double r){
      this(new Point(0,0),r);
      
      
   }
   Circle(Point p, double r){
      super(p);
      this.r=r;
   }
   double calcArea() {
      return Math.PI*r*r;
   }
   
}
class Rectangle extends Shape{
   int width;
   int height;
   Rectangle(int width, int height){
      this(new Point(0,0), width, height);
   }
   Rectangle(Point p, int width, int height){
      super(p);
      this.width= width;
      this.height=height;
   }      
   @Override
   double calcArea() {
      // TODO Auto-generated method stub
      return width*height;
   }

   boolean isSquare() {
      return width*height!=0&&width==height;

   }
   
   
   
public class Ex22 {
    double sumArea(Shape[]arr) {
       double sum =0;
       for(int i=0; i<arr.length; i++) {
          sum+=arr[i].calcArea();
          
       }
       return sum;
    }
   public void main(String[] args) {
      Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
      System.out.println("면적의 합:"+sumArea(arr));

   }

   }

}