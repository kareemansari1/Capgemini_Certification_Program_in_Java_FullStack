package Project;

import java.util.Scanner;

public class EmployeeManagementSystem {
	private static final Scanner scanner = new Scanner(System.in);
	private static final EmployeeManager employeeManager = new EmployeeManager();

	public static void main(String[] args) {
		int choice;
		do {
			// Display the menu options
			System.out.println("Employee Management System");
			System.out.println("1. Add Employee");
			System.out.println("2. View All Employees");
			System.out.println("3. Update Employee");
			System.out.println("4. Delete Employee");
			System.out.println("5. Search Employee");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			// Process the user's choice
			switch (choice) {
			case 1:
				addEmployee();
				break;
			case 2:
				viewAllEmployees();
				break;
			case 3:
				updateEmployee();
				break;
			case 4:
				deleteEmployee();
				break;
			case 5:
				searchEmployee();
				break;
			case 6:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice. Please enter a number between 1 and 6.");
			}
		} while (choice != 6);

		scanner.close();
	}

	private static void addEmployee() {
		// Prompt user to enter employee details
		System.out.println("Enter employee details:");
		System.out.print("Name: ");
		String name = scanner.nextLine();
		System.out.print("Age: ");
		int age = scanner.nextInt();
		scanner.nextLine(); // Consume newline
		System.out.print("Salary: ");
		double salary = scanner.nextDouble();
		scanner.nextLine(); // Consume newline
		System.out.print("Department: ");
		String department = scanner.nextLine();

		// Create a new Employee object and add it to the EmployeeManager
		Employee employee = new Employee(name, age, salary, department);
		employeeManager.addEmployee(employee);
		System.out.println("Employee added successfully!");
	}

	private static void viewAllEmployees() {
		// Display all employees managed by the EmployeeManager
		System.out.println("List of all employees:");
		employeeManager.viewAllEmployees();
	}

	private static void updateEmployee() {
		// Prompt user to enter the ID of the employee to update
		System.out.print("Enter the ID of the employee to update: ");
		int id = scanner.nextInt();
		scanner.nextLine(); // Consume newline

		// Find the employee by ID and update their details
		Employee employee = employeeManager.findEmployeeById(id);
		if (employee != null) {
			System.out.println("Enter new details for employee with ID " + id + ":");
			System.out.print("Name: ");
			String name = scanner.nextLine();
			System.out.print("Age: ");
			int age = scanner.nextInt();
			scanner.nextLine(); // Consume newline
			System.out.print("Salary: ");
			double salary = scanner.nextDouble();
			scanner.nextLine(); // Consume newline
			System.out.print("Department: ");
			String department = scanner.nextLine();

			// Update the employee's details
			employee.setName(name);
			employee.setAge(age);
			employee.setSalary(salary);
			employee.setDepartment(department);
			System.out.println("Employee details updated successfully!");
		} else {
			System.out.println("Employee not found!");
		}
	}

	private static void deleteEmployee() {
		// Prompt user to enter the ID of the employee to delete
		System.out.print("Enter the ID of the employee to delete: ");
		int id = scanner.nextInt();
		scanner.nextLine(); // Consume newline

		// Delete the employee with the given ID
		if (employeeManager.deleteEmployee(id)) {
			System.out.println("Employee with ID " + id + " deleted successfully!");
		} else {
			System.out.println("Employee not found!");
		}
	}

	private static void searchEmployee() {
		// Prompt user to enter the name of the employee to search
		System.out.print("Enter the name of the employee to search: ");
		String name = scanner.nextLine();

		// Search for the employee by name
		Employee employee = employeeManager.findEmployeeByName(name);
		if (employee != null) {
			// Display the details of the found employee
			System.out.println("Employee found:");
			System.out.println(employee);
		} else {
			System.out.println("Employee not found!");
		}
	}
}

class Employee {
	private static int nextId = 1;

	private int id;
	private String name;
	private int age;
	private double salary;
	private String department;

	// Constructor to initialize an Employee object
	public Employee(String name, int age, double salary, String department) {
		this.id = nextId++;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.department = department;
	}

	// Getters and setters for private fields
	public int getId() {
		return id;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	// Override toString() method to return a string representation of the Employee
	// object
	@Override
	public String toString() {
		return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + ", salary=" + salary
				+ ", department='" + department + '\'' + '}';
	}
}

class EmployeeManager {
	private static final int MAX_EMPLOYEES = 100;
	private Employee[] employees;
	private int numEmployees;

	// Constructor to initialize the EmployeeManager object
	public EmployeeManager() {
		employees = new Employee[MAX_EMPLOYEES];
		numEmployees = 0;
	}

	// Method to add a new employee to the employees array
	public void addEmployee(Employee employee) {
		if (numEmployees < MAX_EMPLOYEES) {
			employees[numEmployees++] = employee;
		} else {
			System.out.println("Cannot add more employees. Maximum limit reached.");
		}
	}

	// Method to display details of all employees
	public void viewAllEmployees() {
		for (int i = 0; i < numEmployees; i++) {
			System.out.println(employees[i]);
		}
	}

	// Method to find an employee by ID
	public Employee findEmployeeById(int id) {
		for (int i = 0; i < numEmployees; i++) {
			if (employees[i].getId() == id) {
				return employees[i];
			}
		}
		return null;
	}

	// Method to find an employee by name
	public Employee findEmployeeByName(String name) {
		for (int i = 0; i < numEmployees; i++) {
			if (employees[i].getName().equalsIgnoreCase(name)) {
				return employees[i];
			}
		}
		return null;
	}

	// Method to delete an employee by ID
	public boolean deleteEmployee(int id) {
		for (int i = 0; i < numEmployees; i++) {
			if (employees[i].getId() == id) {
				employees[i] = employees[numEmployees - 1];
				numEmployees--;
				return true;
			}
		}
		return false;
	}
}
