class Tv{
	boolean power;
	int channel;
	String color;

	void power() { power = !power;}
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

class TvTest4 {
	public static void main (String[] args){
		Tv[] tvArr = new Tv[3];  // tv 객체를 생성한 것이 아니라 tv 클래스 타입을 가지는 tvarry 배열/공간을 만든것이다.
		for ( int i=0 ; i < tvArr.length; i++){
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10;
		}

		for ( int i=0 ; i < tvArr.length; i++){
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
		}
	}
}
