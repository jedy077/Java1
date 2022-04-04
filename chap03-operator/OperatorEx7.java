class OperatorEx7 {
	public static void main(String[] args){
		byte a = 10;
		byte b = 30;
		byte c = (byte)(a * b);   // byte casting 해 줘야 함 이유는 byte 의 산술 연산 결과는 int 형으로 바뀐다. 이에 byte c에 값을 저장하기 위해서는 형변형이 필수이다. 
					// 그런데 여기서 문제가 된다. a * b 는 300 이라는 숫치가 되고 byte 8bit 가 가질 수 있는 최대 수는 255 이다(부호있는 정수) 이에 overflow 가 발생하게 되어 값이 44 가 된다. 
					// 이래서 값을 저장하기 위해서는 결과 값 보다 큰 int 를 사용하여야 한다. 
		System.out.println(c);
	}
}
