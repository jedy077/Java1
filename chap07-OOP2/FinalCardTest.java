class Card {
	final int NUMBER;
	final String KIND;
	Card ( String kind, int num) {
		KIND = kind;
		NUMBER = num;
	}

	Card() {
		this("HEART",1);
	}

	public String toString() {
		return KIND + " " + NUMBER;
	}
}


class FinalCardTest {
	public static void main (String[] args){
		Card c = new Card("HEART", 10);
		// c.NUMBER = 5  불가능 왜 NUMBER 가 final 제한자ㅏ를 사용하기 때문에
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);    // System.out.println(c.toString()); 과 동일하다.
	}
}
