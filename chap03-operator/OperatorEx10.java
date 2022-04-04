class OperatorEx10 {
	public static void main(String[] args){
		int a = 1000000;
		int result1 = a * a / a; // overflow 발생 (a*a)/a  a*a에서 벌써 Int 가 저장할 수 있는 범위를 넘어 섬. 
		int result2 = a / a * a;

		System.out.printf ("%d * %d / %d = %d%n", a, a, a, result1); 
		System.out.printf ("%d / %d * %d = %d%n", a, a, a, result2);
	}
}
