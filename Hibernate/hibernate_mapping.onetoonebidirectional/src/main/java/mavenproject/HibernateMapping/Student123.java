package mavenproject.HibernateMapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.NamedQueries;
import javax.persistence.Table;

@NamedQueries({
    @NamedQuery(name = "findStudentId",query = "from Student std where std.sid =:Id1"),
        @NamedQuery (name = "findStudentByName" , query = "from Student s where s.sname like 'G%'"),
    @NamedQuery(name="findStudentByCity",query="from Student std where std.scity =:city")
})
@Entity
@Table(name = "Student123_11787") // The table is created automatically with this name.
public class Student123 {

	@Id // Marks the field as primary key.
	@GeneratedValue(strategy = GenerationType.AUTO) // The ID is automatically generated.
	private int sid;

	private String sname;
	private String scity;

	// Getter for sid
	public int getSid() {
		return sid;
	}

	// Setter for sid
	public void setSid(int sid) {
		this.sid = sid;
	}

	// Getter for sname
	public String getSname() {
		return sname;
	}

	// Setter for sname
	public void setSname(String sname) {
		this.sname = sname;
	}

	// Getter for scity
	public String getScity() {
		return scity;
	}

	// Setter for scity
	public void setScity(String scity) {
		this.scity = scity;
	}

	// Overriding toString method to print student details
	@Override
	public String toString() {
		return "Student123 [sid=" + sid + ", sname=" + sname + ", scity=" + scity + "]";
	}

	// Parameterized constructor
	public Student123(String sname, String scity) {
		super();
		this.sname = sname;
		this.scity = scity;
	}

	// Default constructor
	public Student123() {
		super();
	}
}
