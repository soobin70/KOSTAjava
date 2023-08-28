import pac.Number;

public class AccessTest1 {
	
	public static void main(String[] args) {
		Number n1 = new Number();
		//n1.pnum =100; //다른 클래스의 private 멤버는 접근 불가
		
		//n1.dnum =100;
		n1.setDnum(100);
		n1.dmethod();
		
		n1.punum=100;
		n1.premethod();
		
		//n1.prnum =100;
		

	}

}
