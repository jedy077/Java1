class TimeTest {
	public static void main (String[] args){
		Time t = new Time(12,35,50);
		System.out.println(t);	// t.toStirng()
		// t.hour = 13;  // error 발생 이뉴는 Private 으로 설정할 예정이므로
		t.setHour(t.getHour() + 1);
		System.out.println(t);
	}
}

class Time {
	private int hour, minute, second;
	Time (int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	int getHour() { return hour; }
	void setHour(int hour) {
		if ( hour < 0 || hour > 23) return;
		this.hour = hour;
	}
	int getMinute() { return minute; }
	void setMinute(int minute) {
		if ( minute < 0 || minute > 59 ) return ;
		this.minute = minute;
	}
	int getSecond() { return second; }
	void setSecond(int second) {
		if (second < 0 || second > 59) return;
		this.second = second;
	}

	public String toString(){
		return hour + ":" + minute +":" + second;
	}
}
