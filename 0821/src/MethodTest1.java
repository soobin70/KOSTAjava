class MyMath{
	int add(int x, int y) { //int x=10; int y=20;
		int result = x+y;
		return result;
	}
}
public class MethodTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath mm = new MyMath();
		int res = mm.add(10,20);
		System.out.println(res);
		
	}

}
