import java.time.*;
import java.time.temporal.*;

class NewTimeEx1 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalTime now = LocalTime.now();

		LocalDate birthDate = LocalDate.of(1977,05,10);
		LocalTime birthTime = LocalTime.of(12,10,10);

		System.out.println("today="+today);
		System.out.println("now = " + now);
		System.out.println("BirthDate = " + birthDate);
		System.out.println("birthTime = " + birthTime);

		System.out.println(birthDate.withYear(2000));
		System.out.println(birthDate.plusDays(1));
		System.out.println(birthDate.plus(1, ChronoUnit.DAYS));
		
		System.out.println(birthTime.truncatedTo(ChronoUnit.HOURS));
		
		System.out.println(ChronoField.CLOCK_HOUR_OF_DAY.range());
		System.out.println(ChronoField.HOUR_OF_DAY.range());
		
	}
}
