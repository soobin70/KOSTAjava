class MyNumber{
	int num; //클래스 내 변수는 클래스 내 메소드들이 공유한다
	void func1(int n) {
		int number = n;
		num=number;
	}
	void func2(int n) {
		int number = n;
		num= number;
	}
}
class MyMath2{
	int x, y;
	int add() {
		return x+y;
	}
	int multi() {
		return x*y;
	}
}
public class VariableTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNumber mn = new MyNumber();
		System.out.println(mn.num);
		mn.func1(10);
		System.out.println(mn.num);
		mn.func2(20);
		System.out.println(mn.num);

		MyMath2 mm = new MyMath2();
		mm.x=10;
		mm.y=20;
		System.out.println (mm.add());
		mm.x =200;
		System.out.println(mm.multi());
	}

}
