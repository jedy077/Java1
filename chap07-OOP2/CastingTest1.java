class CastingTest1 {
	public static void main (String[] args){
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		fe.water(); 	// 가능	
		car = fe  ;	// 가능 up-casting
		// car.water()	// 불가능 car에 참조변수 타입은 water를 참조할수 없다. 
		fe2 = (FireEngine) car;		// down-casting
		fe2.water()	; // 문제가 안되지 왜?? fe2 는 fireengine 타입이며, 즉 water()를 참조할 수 있다. 
	}
}

class Car {
	String color;
	int door;

	void drive(){
		System.out.println("생");
	}

	void stop() {
		System.out.println("Stop!!!");
	}
}

class FireEngine extends Car {
	void water(){
		System.out.println("water!!");
	}
}	
