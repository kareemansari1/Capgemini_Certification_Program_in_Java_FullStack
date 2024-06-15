package cascadeex;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Learner {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	private int lid;
	private String lname;
	
	@OneToMany(mappedBy = "l",cascade = CascadeType.PERSIST)
	private List<Mobile> mlist=new ArrayList<Mobile>();
	
	
	
	public void addMobileNumber(Mobile m) {
		this.mlist.add(m);
		m.setL(this);
	}
	
	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public List<Mobile> getMlist() {
		return mlist;
	}

	public void setMlist(List<Mobile> mlist) {
		this.mlist = mlist;
	}

	
}
