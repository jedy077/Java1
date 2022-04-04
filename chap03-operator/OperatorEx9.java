class OperatorEx9 {
	public static void main (String[] args){
		long a = 1_000_000 * 1_000_000;  // overflow 발생 - 이유는 1_000_000은 int 형에 맞고 이 계산 결과는 Int형으로 값을 다 표현 못한다. 
		long b = 1_000_000 * 1_000_000L;  // 이 부분은 피 연산자 마지막이 Long  type 이므로 결과는 long type으로 할당.

		System.out.println ("a="+a);
		System.out.println ("b="+b);	
	}
}
