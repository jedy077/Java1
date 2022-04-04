class OperatorEx8 {
	public static void main (String[] args){
		int a = 1_000_000;
		int b = 2_000_000;
		
		long c = a * b;   
		/* 결과값이 이상하게 나온다. overflow 값으로 인해 이상한 결과를 나타나게 된다. 
		   그 이유는 long c 가 존재하지만 이미 계산 된 결과가 int 크기로 마주처져 있기 때문이다. 
		 int = 4byte   이므로 int a * int b 의 결과는 int 자료형에 담기게 되어 overflow 가 발생
		따라서 이러한 경우  (long) a + b 로 바로 형변환을 시켜야 한다.  */		

		System.out.println( c);
	}
}
