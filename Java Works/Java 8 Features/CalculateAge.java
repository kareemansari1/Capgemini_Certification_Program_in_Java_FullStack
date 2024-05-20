package Java8Features;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculateAge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Prompting user to enter birth date
		System.out.println("Please enter your birth date (yyyy-mm-dd format only) ");
		String st = sc.nextLine();

		// Parsing user input to LocalDate
		LocalDate Dob;
		Dob = LocalDate.parse(st);

		// Calling method to calculate age and printing the result
		System.out.println("Age is :- " + calcAge(Dob));
	}

	// Method to calculate age
	static int calcAge(LocalDate st) {
		// Getting current date
		LocalDate currentDate = LocalDate.now();

		// Calculating period between birth date and current date to get age
		 int age = Period.between(st, currentDate).getYears();
		 return age;
		//int course = Period.between(st, currentDate).getMonths();
		//int day = Period.between(st, currentDate).getDays();

		//System.out.println("Month is : " + course);
		//System.out.println("Days is : " + day);

		//return course;
	}
}
