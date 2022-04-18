// sum and average
class ArrayEx5{
	public static void main (String[] args){
		int[] score = {100,88,100,100,90};
		int sum =0;
		for (int i =0 ; i < score.length; i++){
			sum += score[i];
		}
		System.out.printf("총점: %d%n", sum);
		System.out.printf("평균: %f%n", (float)sum/(float)score.length);
	}
}
