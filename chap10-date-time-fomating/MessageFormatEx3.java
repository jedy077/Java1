import java.text.*;
class MessageFormatEx3 {
	public static void main(String[] args){
		String[] data = {
			"INSERT INTO CUST_INFO VALUES ('이자바','02-222-2222',27,'07-09');",
			"INSERT INTO CUST_INFO VALUEs ('김프로','01-111-1111',24,'10-08')"
	};
	
	String pattern = "INSERT INTO CUST_INFO VALUES ({0},{1},{2},{3});";
	MessageFormat mf = new MessageFormat(pattern);
	for(int i=0 ; i < data.length; i++){
		try{
			Object[] objs = mf.parse(data[i]);
			for (int j = 0 ; j < objs.length; j++){
				System.out.print(objs[j] + ",");
		}
		} catch (Exception e) {}
		System.out.println();
	}
	}
}
