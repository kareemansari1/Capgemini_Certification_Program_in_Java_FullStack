package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employeees {
	private int id;
	private String name;
	private int age;
	private long salary;
	private String gender;
	private String deptName;
	private String city;
	private int yearOfJoining;

	public Employeees(int id, String name, int age, long salary, String gender, String deptName, String city,
			int yearOfJoining) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
		this.deptName = deptName;
		this.city = city;
		this.yearOfJoining = yearOfJoining;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	// Getters and setters omitted for brevity
	@Override
	public String toString() {
		return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + ", salary=" + salary
				+ ", gender='" + gender + '\'' + ", deptName='" + deptName + '\'' + ", city='" + city + '\''
				+ ", yearOfJoining='" + yearOfJoining + '\'' + '}';
	}
}

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a List of Employee Objects:
		List<Employeees> empList = new ArrayList<>();
		empList.add(new Employeees(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
		empList.add(new Employeees(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
		empList.add(new Employeees(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
		empList.add(new Employeees(4, "def", 32, 125, "F", "HR", "Chennai", 2013));
		empList.add(new Employeees(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
		empList.add(new Employeees(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
		empList.add(new Employeees(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
		empList.add(new Employeees(8, "pqr", 23, 145, "M", "IT", "Trivandrum", 2015));
		empList.add(new Employeees(9, "stv", 25, 160, "M", "IT", "Blore", 2010));

		// Question 1: Grouping Employees by City
		// Define a map to store employees grouped by city
		Map<String, List<Employeees>> empByCity;
		// Group employees by city using Stream API
		empByCity = empList.stream().collect(Collectors.groupingBy(Employeees::getCity));
		// Print the grouped employees
		System.out.println("Employees grouped by city :: \n" + empByCity);

		// Question 2: Grouping Employees by Age
		// Define a map to store employees grouped by age
		Map<Integer, List<Employeees>> empByAge;
		// Group employees by age using Stream API
		empByAge = empList.stream().collect(Collectors.groupingBy(Employeees::getAge));
		// Print the grouped employees
		System.out.println("Employees grouped by age :: \n" + empByAge);

		// Question 3: Finding the Count of Male and Female Employees
		// Define a map to store the count of male and female employees
		Map<String, Long> noOfMaleAndFemaleEmployees = empList.stream()
				.collect(Collectors.groupingBy(Employeees::getGender, Collectors.counting()));
		// Print the count of male and female employees
		System.out.println(
				"Count of male and female employees present in the organization:: \n" + noOfMaleAndFemaleEmployees);

		// Question 4: Printing Names of All Departments
		// Print the names of all departments in the organization
		System.out.println("Names of all departments in the organization ");
		empList.stream().map(Employeees::getDeptName).distinct().forEach(System.out::println);

		// Question 5: Printing Employee Details by Age Criteria
		// Print employee details whose age is greater than 28
		System.out.println("Employee details whose age is greater than 28");
		empList.stream().filter(e -> e.getAge() > 28) // Filtering employees based on age criteria
				.forEach(System.out::println); // Printing employee details

		// Question 6: Finding Maximum Age of Employee
		// Find maximum age of employee
		OptionalInt max = empList.stream().mapToInt(Employeees::getAge) // Map employee ages to IntStream
				.max(); // Find the maximum age
		if (max.isPresent()) {
			System.out.println("Maximum age of Employee: " + max.getAsInt());
		}

		// Question 7: Printing Average Age of Male and Female Employees
		// Print Average age of Male and Female Employees
		Map<String, Double> avgAge = empList.stream().collect(Collectors.groupingBy(Employeees::getGender, // Group
																											// employees
																											// by
																											// gender
				Collectors.averagingInt(Employeees::getAge) // Compute average age for each gender
		));
		System.out.println("Average age of Male and Female Employees:: " + avgAge);

		// Question 8: Printing the Number of Employees in Each Department
		// Print the number of employees in each department
		Map<String, Long> countByDept = empList.stream().collect(Collectors.groupingBy(Employeees::getDeptName, // Group
																												// employees
																												// by
																												// department
				Collectors.counting() // Count the number of employees in each department
		));
		System.out.println("Number of employees in each department:");
		for (Map.Entry<String, Long> entry : countByDept.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		// Question 9: Finding the Oldest Employee
		// Find the oldest employee
		Optional<Employeees> oldestEmp = empList.stream().max(Comparator.comparingInt(Employeees::getAge));
		// Retrieve the oldest employee details
		if (oldestEmp.isPresent()) {
			Employeees oldestEmployee = oldestEmp.get();
			System.out.println("Oldest employee details:: \n" + oldestEmployee);
		} else {
			System.out.println("No employees found in the list.");
		}

		// Question 10: Finding the Youngest Female Employee
		// Find the youngest female employee
		Optional<Employeees> youngestEmp = empList.stream().filter(e -> e.getGender().equals("F")) // Filter by
																									// gender
																									// (female)
				.min(Comparator.comparingInt(Employeees::getAge)); // Find the minimum age
		// Retrieve the youngest female employee details
		if (youngestEmp.isPresent()) {
			Employeees youngestEmployee = youngestEmp.get();
			System.out.println("Youngest Female employee details:: \n" + youngestEmployee);
		} else {
			System.out.println("No female employees found in the list.");
		}

		// Question 11: Finding Employees by Age Range
		// Find employees whose age is greater than 30 and less than 30
		System.out.println("Employees whose age is greater than 25 and less than 25");
		// Partition employees by age using Collectors.partitioningBy()
		Map<Boolean, List<Employeees>> partitionEmployeesByAge = empList.stream()
				.collect(Collectors.partitioningBy(e -> e.getAge() > 30));
		// Iterate through the partitioned map and print the results
		Set<Map.Entry<Boolean, List<Employeees>>> empSet = partitionEmployeesByAge.entrySet();
		for (Map.Entry<Boolean, List<Employeees>> entry : empSet) {
			if (Boolean.TRUE.equals(entry.getKey())) {
				// Employees greater than 30 years old
				System.out.println("Employees greater than 30 years ::" + entry.getValue());
			} else {
				// Employees less than 30 years old
				System.out.println("Employees less than 30 years ::" + entry.getValue());
			}
		}

		// Question 12: Finding Department with Highest Number of Employees
		// Find the department name with the highest number of employees
		Map.Entry<String, Long> maxNoOfEmployeesInDept = empList.stream()
				.collect(Collectors.groupingBy(Employeees::getDeptName, Collectors.counting())).entrySet().stream()
				.max(Map.Entry.comparingByValue()).get();
		// Print the department with the highest number of employees
		System.out.println("Max no of employees present in Dept :: " + maxNoOfEmployeesInDept.getKey());

		// Question 13: Finding Employees from HR Department
		// Find if there are any employees from the HR Department
		Optional<Employeees> emp = empList.stream().filter(e -> e.getDeptName().equalsIgnoreCase("HR")).findAny();
		// Check if an employee from the HR department is found
		emp.ifPresent(employee -> System.out.println("Found employees from HR department: " + employee));

		// Question 14: Finding Departments with Over 3 Employees
		System.out.println("Department names where the number of employees in the department is over 3 :: ");
		empList.stream().collect(Collectors.groupingBy(Employeees::getDeptName, Collectors.counting())).entrySet()
				.stream().filter(entry -> entry.getValue() > 3).forEach(System.out::println);

		// Question 15: Finding Distinct Department Names
		System.out.println("Distinct department names that employees work for:: ");
		empList.stream().map(Employeees::getDeptName) // Extract department names
				.distinct() // Retrieve distinct department names
				.forEach(System.out::println); // Print each distinct department name

		// Question 16: Finding and Sorting Employees by City
		empList.stream() // Create a stream of employees
				.filter(e -> e.getCity().equalsIgnoreCase("Blore")) // Filter employees living in 'Blore'
				.sorted(Comparator.comparing(Employeees::getName)) // Sort employees by name
				.forEach(e -> System.out.println("Employees staying in Blore:: " + e.getName())); // Print the names
																									// of
																									// employees
		// Question 17: Counting the Number of Employees in the Organization
		System.out.println("No of employees in the organisation :: " + empList.stream().count());

		// Question 18: Finding Employee Count in Every Department
		Map<String, Long> employeeCountInDepartmentMap = empList.stream()
				.collect(Collectors.groupingBy(Employeees::getDeptName, Collectors.counting()));
		System.out.print("Employee department and its count :- \n" + employeeCountInDepartmentMap);

		// Question 19: Finding Department with the Highest Number of Employees
		Optional<Map.Entry<String, Long>> deptNameWithHighestEmp = employeeCountInDepartmentMap.entrySet().stream()
				.max(Map.Entry.comparingByValue());
		if (deptNameWithHighestEmp.isPresent()) {
			System.out.println("Department which has the highest number of employees " + deptNameWithHighestEmp.get());
		}

		// Question 20: Sorting Employees by Name and Age
		System.out.println("Sorting based on name and age:: ");
		// Comparator for sorting by name
		Comparator<Employeees> comparator1 = Comparator.comparing(Employeees::getName);
		// Comparator for sorting by age
		Comparator<Employeees> comparator2 = Comparator.comparingInt(Employeees::getAge);
		// Sorting the stream of employees using comparator chaining
		empList.stream().sorted(comparator1.thenComparing(comparator2)).forEach(System.out::println);

		// Question 21: Finding the Highest Experienced Employee
		Optional<Employeees> seniorEmp = empList.stream().sorted(Comparator.comparingInt(Employeees::getYearOfJoining))
				.findFirst();
		System.out.println("Senior Employee Details: " + seniorEmp.get());

		// Question 22: Printing Average and Total Salary of the Organization
		DoubleSummaryStatistics empSalary = empList.stream()
				.collect(Collectors.summarizingDouble(Employeees::getSalary));
		System.out.println("Average Salary in the organisation = " + empSalary.getAverage());
		System.out.println("Total Salary in the organisation = " + empSalary.getSum());

		// Question 23: Printing Average Salary of Each Department
		System.out.println("Print Average salary of each department");
		Map<String, Double> avgSalary = empList.stream().collect(
				Collectors.groupingBy(Employeees::getDeptName, Collectors.averagingDouble(Employeees::getSalary)));
		Set<Map.Entry<String, Double>> entrySet = avgSalary.entrySet();
		for (Map.Entry<String, Double> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		// Question 24: Finding the Highest Salary in the Organization
		Optional<Employeees> empHighest = empList.stream()
				.sorted(Comparator.comparingDouble(Employeees::getSalary).reversed()).findFirst();
		System.out.println("Highest Salary in the organization : " + empHighest.get().getSalary());

		// Question 25: Finding the Second Highest Salary in the Organization
		Optional<Employeees> emp2 = empList.stream()
				.sorted(Comparator.comparingDouble(Employeees::getSalary).reversed()).skip(1).findFirst();
		System.out.println("Second Highest Salary in the organisation : " + emp2.get().getSalary());

		// Question 26: Finding the Nth Highest Salary in the Organization
		int n = 7; // Represents the Nth highest salary to find
		Optional<Employeees> empNthHighest = empList.stream()
				.sorted(Comparator.comparingDouble(Employeees::getSalary).reversed()).skip(n - 1).findFirst();
		System.out.println("Nth Highest Salary in the organisation : " + empNthHighest.get().getSalary());

		// Question 27: Finding the Highest Paid Salary in the Organization Based on
		// Gender
		Map<String, Optional<Employeees>> highestPaidMFEmployee = empList.stream().collect(Collectors.groupingBy(
				Employeees::getGender, Collectors.maxBy((t1, t2) -> (int) (t1.getSalary() - t2.getSalary()))));
		System.out.println("Highest paid male and female employee : " + highestPaidMFEmployee);

		// Question 28: Finding the Lowest Paid Salary in the Organization Based on
		// Gender
		Map<String, Optional<Employeees>> lowestPaidMFEmployee = empList.stream().collect(Collectors.groupingBy(
				Employeees::getGender, Collectors.minBy((t1, t2) -> (int) (t1.getSalary() - t2.getSalary()))));
		System.out.println("Lowest paid male and female employee : " + lowestPaidMFEmployee);

		// Question 29: Sorting Employees' Salary in Ascending Order
		System.out.println("Sorting the organisation's employee salary in ascending order ");
		empList.stream().sorted(Comparator.comparingLong(Employeees::getSalary)).toList().forEach(System.out::println);

		// Question 30: Sorting Employees' Salary in Descending Order:
		System.out.println("Sorting the organisation's employee salary in descending order ");
		empList.stream().sorted(Comparator.comparingLong(Employeees::getSalary).reversed()).toList()
				.forEach(System.out::println);

		// Question 31: Finding the Highest Salary Based on Department:
		System.out.println("Highest salary dept wise:: \n" + empList.stream().collect(
				Collectors.groupingBy(Employeees::getDeptName, Collectors.collectingAndThen(Collectors.toList(),
						list -> list.stream().max(Comparator.comparingDouble(Employeees::getSalary))))));

		// Question 32: Printing the List of Employee's Second Highest Record Based on
		// Department:
		System.out
				.println(
						"Highest second salary dept wise:: \n" + empList.stream()
								.collect(Collectors.groupingBy(Employeees::getDeptName,
										Collectors.collectingAndThen(Collectors.toList(), list -> list.stream()
												.sorted(Comparator.comparingDouble(Employeees::getSalary).reversed())
												.skip(1).findFirst()))));

		// Question 33: Sorting the Employees' Salary in Each Department in Ascending
		// Order:
		System.out.println("Sorting the department wise employee salary in ascending order:: ");
		Map<String, Stream<Employeees>> sortedEmployeeAsc = empList.stream().collect(
				Collectors.groupingBy(Employeees::getDeptName, Collectors.collectingAndThen(Collectors.toList(),
						list -> list.stream().sorted(Comparator.comparingDouble(Employeees::getSalary)))));
		sortedEmployeeAsc.forEach((deptName, employees) -> {
			System.out.println(deptName);
			System.out.println(employees.collect(Collectors.toList()));
		});

		// Question 34: Sorting the Employees' Salary in Each Department in Descending
		// Order:
		System.out.println("Sorting the department wise employee salary in descending order ");
		Map<String, Stream<Employeees>> sortedEmployeeDesc = empList.stream()
				.collect(Collectors.groupingBy(Employeees::getDeptName, Collectors.collectingAndThen(
						Collectors.toList(),
						list -> list.stream().sorted(Comparator.comparingDouble(Employeees::getSalary).reversed()))));
		sortedEmployeeDesc.forEach((deptName, employees) -> {
			System.out.println(deptName);
			System.out.println(employees.collect(Collectors.toList()));
		});

	}

}
