class TClass1{
	void method1() {
		int num1;
		method2(); //같은 클래스 내의 메소드들 끼리는 서로 호출이 가능하다(레퍼런스 변수 없이)
	}
	void method2() {
		int num2;
		method3();
	}
	void method3() {
		int num3;
	}
	
}
class TClass2{
	void title() {
		System.out.println("--------");
		System.out.println("제목");
		boolean flag = false;
		if(flag == true)
			return;
	}
}
public class classTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TClass1 tc = new TClass1();
		tc.method1();

	}

}
