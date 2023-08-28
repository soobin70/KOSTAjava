package ex07;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard1[] cards = new SutdaCard1[CARD_NUM];

	SutdaDeck() {
		int length = CARD_NUM/2;
		 for(int  i =0; i<length; i++) {
		     if((i+1)==1||(i+1)==3||(i+1)==8) {
		    	 cards[i] = new SutdaCard1(i+1,true);
		     }else {
		    	 cards[i] = new SutdaCard1(i+1,false);
		     }
		     cards[10+i] = new SutdaCard1(i+1,false);
		}
		
	}
	void shuffle() {
		for(int i =0; i<1000; i++) {
		int idx1 =(int) (Math.random()*20);
		int idx2 =(int) (Math.random()*20);
		
		SutdaCard1 temp = cards[idx1];
		cards[idx1] = cards[idx2];
		cards[idx2] = temp;
		}
	}
	SutdaCard1 pick(int index) {
		return cards[index];
	}
	SutdaCard1 pick() {
		int idx = (int)(Math.random()*20);
		return cards[idx];
	}
}

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	// info()대신 Object클래스의 toString()을 오버라이딩했다.
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

public class Ex07_1 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
	}

}
