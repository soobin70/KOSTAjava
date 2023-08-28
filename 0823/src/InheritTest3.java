class Parent{
//	Parent(){
//		System.out.println("Parent()");
//	}
	Parent(int n){
		System.out.println("Parent(int n)");
	}
}
class Child extends Parent{
	int m;
	Child(){
		super(0); //부모가 아닌 다른생성자 호출 시키려면 super를 붙여줘야한다
		System.out.println("Child()");
	}
	Child(int n, int m){
		super(n);
		this.m=m;
	}
}
public class InheritTest3 {

	public static void main(String[] args) {
		//Parent p = new Parent();
		Child c = new Child(10,20);
	}

}
