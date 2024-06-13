package onetooneubidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity // Marks this class as an entity to be managed by JPA
public class Answer1 {
	@Id // Specifies the primary key of the entity
	private int aid;

	private String aname;

	@OneToOne // Defines a one-to-one relationship with Question1
	private Question1 que1;

	// Getter method for 'que1'
	public Question1 getQue1() {
		return que1;
	}

	// Setter method for 'que1'
	public void setQue1(Question1 que1) {
		this.que1 = que1;
	}

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
