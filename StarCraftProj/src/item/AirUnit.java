package item;

public class AirUnit extends Unit{ //public 접근제어자
//void는 리턴을 안하지만 메서드, 리턴타입이 있는건 void가 안붙는 메서드

	AirUnit(int hp){ //앞에 아무것도 없고 클래스랑 이름이 같고 대문자로 시작, 
		            //변수의 값을 초기화 (),{}가 있으면 '생성자' 
		             // 메서드는 소문자로 시작
		super(hp);
	}
}
