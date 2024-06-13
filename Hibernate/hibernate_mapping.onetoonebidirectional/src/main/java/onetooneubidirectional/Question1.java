package onetooneubidirectional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity // Marks this class as an entity to be managed by JPA
public class Question1 {
	@Id // Specifies the primary key of the entity
	@GeneratedValue(strategy = GenerationType.AUTO) // Configures the way of incrementing the specified column (qid)
	private int qid;

	private String qname;

	@OneToOne(mappedBy = "que1") // Defines a one-to-one relationship with Answer1, "mappedBy" indicates that the
									// Answer1 entity owns the relationship
	private Answer1 ans;

	// Getter and Setter methods for 'ans'
	public Answer1 getAns() {
		return ans;
	}

	public void setAns(Answer1 ans) {
		this.ans = ans;
	}

	// Getter and Setter methods for 'qid'
	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	// Getter and Setter methods for 'qname'
	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}
}
