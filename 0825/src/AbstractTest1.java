abstract class Player{
	int currentPos;
	public Player() {
		currentPos=0;
	}
	abstract void play(int pos);
	abstract void stop();
	void play() {
		play(currentPos);
	}
}
//abstract class 를 상속받으면 abstract method륿 반드시 구현하지 않으면
//상속받은 자식 클래스도 abstract 클래스여야 한다
class DPlayer extends Player{
	@Override
	void play(int pos){
		System.out.println("DPlayer play(int pos)");
	}
	@Override
	void stop() {
		System.out.println("DPlayer stop()");
	}
	
}
public class AbstractTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DPlayer dPlayer = new DPlayer();
		dPlayer.play();
		dPlayer.stop();
		
		Player Player = new DPlayer();
		Player.play();
		Player.stop();
		

	}

}
