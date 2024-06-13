package onetooneunidirection;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // Marks this class as an entity to be managed by JPA
public class Answer {
	@Id // Specifies the primary key of the entity
	private int aid;

	private String aname;

	// Getter method for 'aid'
	public int getAid() {
		return aid;
	}

	// Setter method for 'aid'
	public void setAid(int aid) {
		this.aid = aid;
	}

	// Getter method for 'aname'
	public String getAname() {
		return aname;
	}

	// Setter method for 'aname'
	public void setAname(String aname) {
		this.aname = aname;
	}
}
