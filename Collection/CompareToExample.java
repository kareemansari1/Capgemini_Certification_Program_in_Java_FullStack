package collectionEx;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// EmployeeData class to represent employee information
class EmployeeData {
	int empId;
	String ename;
	LocalDate eDOJ; // Employee Date of Joining
	String edesig; // Employee Designation

	// Constructor to initialize EmployeeData objects
	public EmployeeData(int empId, String ename, LocalDate eDOJ, String edesig) {
		this.empId = empId;
		this.ename = ename;
		this.eDOJ = eDOJ;
		this.edesig = edesig;
	}

	// Method to display EmployeeData object as a string
	@Override
	public String toString() {
		return "EmployeeData [empId=" + empId + ", ename=" + ename + ", eDOJ=" + eDOJ + ", edesig=" + edesig + "]";
	}
}

// Comparator to sort EmployeeData objects by name
class EmpSortByName implements Comparator<EmployeeData> {
	@Override
	public int compare(EmployeeData o1, EmployeeData o2) {
		return o1.ename.compareTo(o2.ename);
	}
}

// Comparator to sort EmployeeData objects by Date of Joining
class EmpSortByDOJ implements Comparator<EmployeeData> {
	@Override
	public int compare(EmployeeData o1, EmployeeData o2) {
		return o1.eDOJ.compareTo(o2.eDOJ);
	}
}

// Main class for demonstrating sorting of EmployeeData objects
public class CompareToExample {
	public static void main(String[] args) {
		// Create an ArrayList to store EmployeeData objects
		ArrayList<EmployeeData> arrayList = new ArrayList<EmployeeData>();
		// Add EmployeeData objects to the ArrayList
		arrayList.add(new EmployeeData(1, "Kareem", LocalDate.of(2024, 12, 15), "Developer"));
		arrayList.add(new EmployeeData(1, "Mazhar", LocalDate.of(2022, 2, 13), "Developer"));
		arrayList.add(new EmployeeData(1, "Adnan", LocalDate.of(2020, 11, 10), "Developer"));
		arrayList.add(new EmployeeData(1, "Mack", LocalDate.of(2019, 8, 3), "Developer"));

		// Sort EmployeeData objects by name
		System.out.println("Sort By Name");
		Collections.sort(arrayList, new EmpSortByName());
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}

		System.out.println();

		// Sort EmployeeData objects by Date of Joining
		System.out.println("Employee Sort By Date");
		Collections.sort(arrayList, new EmpSortByDOJ());
		for (int j = 0; j < arrayList.size(); j++) {
			System.out.println(arrayList.get(j));
		}
	}
}
