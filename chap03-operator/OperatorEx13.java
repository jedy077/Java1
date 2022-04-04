class OperatorEx13 {
	public static void main (String[] args){
		char c1 = 'a';
//		char c2 = c1 + 1;   <== 대입 연산자에서 변수가 사용되었으며, 이 경우 컴파일러는 c1 + 1이 어떤 타입인지 미리 계산을 할 수 없어 에러가 발생한다. 이 경우 (char) (c1 +1 )을 하여 지정해 줘야 한다.
		char c2 = 'a' + 1;  // 이 부분은 'a' 는 reference 변수가 아닌 literal 값이다. 그래서 계산이 된다.
		System.out.println(c2);
	}
}
