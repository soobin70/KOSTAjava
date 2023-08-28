interface Fightable{
	void fight();
}
interface Helping{
	void help();
}
abstract  class Unit{
	public void move() {
	}
}
class Fighter extends Unit implements Fightable{
	@Override
	public void fight() {
			System.out.println("Fighter fight");
	}
	@Override
	public void move() {
		System.out.println("Fighter move");
		
	}
}
class Helper extends Unit implements Helping{
	@Override
	public void help() {
			System.out.println("Helper help");
	}
	@Override
	public void move() {
		System.out.println("Helper move");
		
	}
	
}
class Comber extends Unit implements Fightable, Helping{
	@Override
	public void help() {
		System.out.println("Comber Help");
			
	}
	@Override
	public void fight() {
		System.out.println("Comber fight");
	}
	@Override
	public void move() {
		System.out.println("Comber move");
		
	}
	
}

public class InterfaceTest1 {
	public static void main(String[] args) {
    Fighter fighter = new Fighter();
	Fightable fighter1 = fighter;
	Unit unit =  fighter;
	unit.move();
	
	//fighter.move(); // 레퍼런스 타입에 없는 메소드 호출은 불가능
	Helper helper = new Helper();
	Helping helping = helper;
	helping.help();
	Unit unit2 = helper;
	unit2.move();
	
	Comber comber = new Comber();
	Fightable fighter2 = comber;
	Helping helping2 = comber;
	Unit unit3 = comber;
	unit3.move();
	
	System.out.println("==================");
	System.out.println("method1()");
	
	method1(fighter);
	method1(comber);
	//method1(helper); 에러
	//method2(fighter); 에러
	System.out.println("==================");
	System.out.println("method2()");
	method2(comber);
	method2(helper);
	System.out.println("==================");
	System.out.println("method3()");
	
	method3(fighter); 
    method3(comber);
	method3(helper);
	
	}
	static void method1(Fightable unit) {
		unit.fight();
	}
	static void method2(Helping unit) {
		unit.help();
		
	}
	static void method3(Unit unit) {
		unit.move();
	}
}

