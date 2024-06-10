package mavenproject.HibernateMapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Studnet123_11787") // table created automatically.
public class Student123 {
	@Id // primary key.
	@GeneratedValue(strategy = GenerationType.AUTO) // id auto genrated.
	private int sid;
	private String sname;
	private String scity;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getScity() {
		return scity;
	}

	public void setScity(String scity) {
		this.scity = scity;
	}

	@Override
	public String toString() {
		return "Student123 [sid=" + sid + ", sname=" + sname + ", scity=" + scity + "]";
	}

	public Student123(String sname, String scity) {
		super();
		this.sname = sname;
		this.scity = scity;
	}

	public Student123() {
		super();
		// TODO Auto-generated constructor stub
	}

}
