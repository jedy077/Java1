import java.util.*;

class FlowEx2{
	public static void main (String [] args){
		int input;
		System.out.print("숫자를 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		input = Integer.parseInt(tmp);
		
		if (input == 0) {
			System.out.printf("입력하신 숫자는 %d 입니다.%n", input);
		}
		if ( input != 0) {
			System.out.printf("입력하신 숫자는 0이 아닙니다. %n");
			System.out.printf("입력하신 숫자는 %d 입니다. %n",input);
		}
	}
}
