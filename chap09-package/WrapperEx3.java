class WrapperEx3 {
	public static void main(String args[]){
		int i = 10 ;
		Integer intg = (Integer)i;  // Integer intg = Integer.valueOf(i);
		Object obj = (Object)i;		// Object obj = (Obejct)Integer.valueOf(i);
		Long	lng = 100L;		// Long lng = new Long(100L);
		
		int i2 = intg + 10;		// 참조형과 기본형은 연산이 가능하다. 
		long l = int g + lng; 	// 참조형간의 덧셈도 가능
		
		Integer intg2 = new Integer(20);
		int i3 = (int)intg2;
		
		Integer intg3 = intg2 + i3;

		System.out.pr
	}
}
