class Person{
	String name;
	int age;
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return "이름"+name+",나이:"+age;
				}

//	public String info() {
//		return "이름"+name+",나이:"+age;
//				}
//	
}
public class ToStringTest {

	public static void main(String[] args) {
		Person p = new Person("hong", 30);
		String str = "!!!"+p;
		System.out.println(p);
	}

}
