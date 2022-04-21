class MemberCall {
	int iv = 10;
	static int cv = 20;
	int iv2 = cv;
//	static int cv2 = iv ; error ; why  iv 는 인스턴스 변수로 없을 수도 있다. (프로그램은 확실하지 않은 경우 error를 발생-내생각)
	static int cv2 = new MemberCall().iv; // 이건 okay 
	
	static void staticMethod1(){
		System.out.println(cv);
//		System.out.println(iv); this is error 이유는 iv 가 없을 수도 있다. 
		MemberCall c = new MemberCall();
		System.out.println(c.iv);
	}
	
	void instanceMethod1(){
		System.out.println(cv);
		System.out.println(iv);  // 가능 이유는 instance 함수는 instance 생성이 되어야 메모리에 올라오므로 당연히 instance 변수도 사용가능하다.
	}

	static void staticMethod2(){
		staticMethod1();
//		instanceMethod1(); //error 객체가 생성되지 않아서 호출할 수 없음.
		MemberCall c = new MemberCall();
		c.instanceMethod1();
	}

	void instanceMethod2() {
		staticMethod1();
		instanceMethod1();
	}
	
}
