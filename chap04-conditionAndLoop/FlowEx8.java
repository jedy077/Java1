// 주민등록을 입력받아 성별 체크

import java.util.*;

class FlowEx8{
	public static void main (String[] args){
		System.out.print ("당신의 주민번호를 입력해 주세요.(010101-1111222)>");

		Scanner scanner = new Scanner(System.in);
		String regNo = scanner.nextLine();
		char gender = regNo.charAt(7);   // array 인수와 비슷 0 부터 시작
		switch(gender){
			case '1': case '3':
				System.out.println("당신은 남자입니다.");
				break;
			case '2': case '4':
				System.out.println("당신은 여자입니다");
				break;
			default:
				System.out.println("유효하지 않은 주민등록번호입니다.");
		}
	}
}
