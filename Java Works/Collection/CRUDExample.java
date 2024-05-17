package collectionEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

class Student {
	private int RollNo;
	private String sname;
	private String dpet;
	private String college;

	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getDpet() {
		return dpet;
	}

	public void setDpet(String dpet) {
		this.dpet = dpet;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public Student(int rollNo, String sname, String dpet, String college) {
		super();
		RollNo = rollNo;
		this.sname = sname;
		this.dpet = dpet;
		this.college = college;
	}

	@Override
	public String toString() {
		return "Student [RollNo=" + RollNo + ", sname=" + sname + ", dpet=" + dpet + ", college=" + college + "]";
	}

}

public class CRUDExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> arrayList = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println(" Menu");
			System.out.println("1. INSERT");
			System.out.println("2. UPDATE");
			System.out.println("3. DELETE");
			System.out.println("4. SEARCH");
			System.out.println("5. DISPLAY");
			System.out.println("6. SORT BY NAME");
			System.out.println("7. EXIT");
			System.out.println("Enter Your Choice ");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.println("Enter The Student Roll Number :");
				int rollno = sc.nextInt();
				System.out.println("Enter The Student Name :");
				String sname = sc.next();
				System.out.println("Enter The Student Department :");
				String dept = sc.next();
				System.out.println("Enter The Student College Name :");
				String cname = sc.next();
				Student s = new Student(rollno, sname, dept, cname);
				arrayList.add(s);
				System.out.println("Record Inserted Successfully. ");
				break;
			case 2:
				System.out.println("Enter The Index Of Student to Update :");
				int index = sc.nextInt();
				sc.nextLine();
//				if (index >= 0 && index < arrayList.size()) {
//					System.out.println("Enter The New Roll No :");
//					int newrollno = sc.nextInt();
//					System.out.println("Enter New Student Name :");
//					String newname = sc.nextLine();
//					System.out.println("Enter The New Department");
//					String newdept = sc.nextLine();
//					System.out.println("Enter The New College Name :");
//					String newcname = sc.nextLine();
//					Student s1 = new Student(newrollno, newname, newdept, newcname);
//					arrayList.set(index, s1);
//					// arrayList.set(index, new Student());
//					System.out.println("Student Updated Successfully");
//				} else {
//					System.out.println("Invalid Choice.");
//				}
				boolean found = false;
				System.out.print("Enter Roll No  to Update : ");
				int newrollno = sc.nextInt();
				ListIterator<Student> li = arrayList.listIterator();
				while (li.hasNext()) {
					Student e = li.next();
					if (e.getRollNo() == newrollno) {
						System.out.println("Enter New Student Name :");
						String newname = sc.next();
						System.out.println("Enter The New Department");
						String newdept = sc.next();
						System.out.println("Enter The New College Name :");
						String newcname = sc.next();
						li.set(new Student(newrollno, newname, newdept, newcname));
						System.out.println(arrayList);
						found = true;
					}
				}
				System.out.println("---------------------");
				if (!found) {
					System.out.println("Record Not Found.");
				} else {
					System.out.println("Recod Updated Successfully. ");
				}
				break;
			case 3:
				System.out.println("Enter Roll No of Student to Delete :");
				int delinex = sc.nextInt();
				sc.nextLine();
				boolean found1 = false;
				System.out.println("---------------------");
				Iterator<Student> i;
				i = arrayList.iterator();
				while (i.hasNext()) {
					Student e = i.next();
					if (e.getRollNo() == delinex) {
						i.remove();
						found1 = true;
					}
				}
				if (!found1) {
					System.out.println("Record Not Found");
				} else {
					System.out.println("Record is Deleted Sucessfully");
				}
				System.out.println("---------------------");
				break;
			case 4:
				System.out.println("Enter Name of Student to Search :");
				String searchname = sc.nextLine();
				boolean found2 = false;
				System.out.println("---------------------");
				Iterator<Student> ii;
				ii = arrayList.iterator();
				while (ii.hasNext()) {
					Student e = ii.next();
					if (e.getSname().equalsIgnoreCase(searchname)) {
						System.out.println(e);
						found = true;
					}
				}
				if (!found2) {
					System.out.println("Record Not Found");
				} else {
					System.out.println("Record is Found Sucessfully");
				}
				System.out.println("---------------------");
				break;
			case 5:
				System.out.println("Data in My ArrayList : " + arrayList);
				System.out.println("Data Size in My ArrayList " + arrayList.size());
				break;
			case 6:
				Collections.sort(arrayList, Comparator.comparing(Student::getSname));
				System.out.println(arrayList);
				break;
			case 7:
				System.out.println("Exiting.");
				break;
			default:
				System.out.println("Invalid Choice. Please Enter Number Between 1 to 7");
				break;
			}

		} while (choice != 7);
		sc.close();

	}

}
