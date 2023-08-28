package ex07;

class SutdaCard1 {
	int num;
	boolean isKwang;

	SutdaCard1() {
		this(1, true);
	}

	SutdaCard1(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
    
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

public class Ex14 {

	public static void main(String[] args) {
		SutdaCard card = new SutdaCard(1, true);

	}

}
