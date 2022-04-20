class Tv {
	boolean power;
	int channel;
	String color;

	void power() { power = !power; };
	void channelUp() { ++channel; };
	void channelDown() { --channel; };
}

class TvTest3{
	public static void main (String[] args){
		Tv t1 = new Tv();
		Tv t2 = new Tv();

		System.out.println (" t1의 channel은 "+t1.channel+"입니다.");
		System.out.println (" t2의 channel은 "+t2.channel+"입니다.");
	
		t2 = t1;
		t1.channel = 7;
		System.out.println (" t1의 channel이 "+t1.channel+"변경되었습니다.");
		
		System.out.println (" t1의 channel은 " + t1.channel+"입니다.");
		System.out.println (" t2의 channel은 " + t2.channel+"입니다.");
		
	}
}
