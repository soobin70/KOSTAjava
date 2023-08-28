class TempClass{
	final int x;
	static final int sx =100;
	TempClass(int x){
		this.x=x;//instance final은 생성자에서 초기화 한다
		//sx=x; 에러 //static final은 생성자에서 초기화 할 수 없다
	}
	
	void method(int x) {
		//this.x=x; 에러
	}
}
public class FinalTest1 {

	public static void main(String[] args) {
		final int n;
		n =10;		
		System.out.println(n);
		
		new TempClass(20);
		new TempClass(30);
	}

}
