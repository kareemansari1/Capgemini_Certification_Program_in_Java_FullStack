package Java8Features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateandTime {
	public static void main(String[] args) {

		// Using java.util.Date
		Date d = new Date();
		System.out.println("Date using util: " + d);

		// Using java.sql.Date (deprecated, but for demonstration)
		java.sql.Date d1 = new java.sql.Date(2024, 10, 2);
		System.out.println("Date using mysql: " + d1.getDate());

		// LocalDate
		// Current Date
		LocalDate today = LocalDate.now();
		System.out.println("Current Date=" + today);

		// Specific Date
		LocalDate firstDay_2023 = LocalDate.of(2022, 12, 1);
		System.out.println("Specific Date=" + firstDay_2023);

		// Current Date in a specific time zone (Asia/Kolkata)
		LocalDate todayKolkata = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current Date in IST=" + todayKolkata);

		// LocalTime
		// Current Time
		LocalTime time = LocalTime.now();
		System.out.println("Current Time=" + time);

		// Specific Time of Day
		LocalTime specificTime = LocalTime.of(12, 20, 25, 40);
		System.out.println("Specific Time of Day=" + specificTime);

		// Current Time in a specific time zone (Asia/Kolkata)
		LocalTime timeKolkata = LocalTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current Time in IST=" + timeKolkata);

		// LocalDateTime
		// Current DateTime
		LocalDateTime today1 = LocalDateTime.now();
		System.out.println("Current DateTime=" + today1);
	}
}
