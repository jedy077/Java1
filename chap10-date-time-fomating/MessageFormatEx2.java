import java.text.*;

class MessageFormatEx2 {
	public static void main (String[] args) {
		String tableName = "CUST_INFO";
		String msg = "INSERT INTO " + tableName + " VALUES (''{0}'',''{1}'',''{2}'',''{3}'');";
		Object[][] arguments = {
			{"이자바","02-222-2222","27","07-09" },
			{"김프로","01-111-1111","45","07-08" }
		};
		for(int i=0; i< arguments.length; i++){
			String result = MessageFormat.format(msg, arguments[i]);
			System.out.println(result);
		}
	}

}
