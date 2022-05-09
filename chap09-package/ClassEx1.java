final class Card {
	String kind;
	int num;
	
	Card(){
		this("SPACE",1);
	}
	Card(String kind, int num){
		this.kind = kind;
		this.num = num;
	}
	
	public String toString(){
		return kind + ":" + num;
	}
}


class ClassEx1 {
	public static void main(String[] args) {
		Card c = new Card("HEART", 3);
		try {
			Card c2 = Card.class.newInstance();
		} catch (Exception e) {}

		Class cobj = c.getClass();

		System.out.println(c);
		System.out.println(c2);
		System.out.println(cobj.getName());
		System.out.println(cobj.toGenericString());
		System.out.println(cobj.toString());
		

	}
}
