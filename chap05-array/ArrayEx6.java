// miin max 구하기
class ArrayEx6{
	public static void main (String[] args){
		int[] score = {79,88,91,33,100,55,95};
		
		int max = score[0];
		int min = score[0];

		for ( int i = 1 ; i < score.length; i++){
			if ( max < score[i])
				max = score[i];
			if ( min > score[i])
				min = score[i];
		}
		System.out.printf ("최대값: %d%n최소값: %d%n",max, min);
	}
}
