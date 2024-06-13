package onetooneunidirection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity // Marks this class as an entity to be managed by JPA
public class Question {
	@Id // Specifies the primary key of the entity
	@GeneratedValue(strategy = GenerationType.AUTO) // Configures the way of incrementing the specified column (qid)
	private int qid;

	private String qname;

	@OneToOne // Defines a one-to-one relationship between Question1 and Answer1
	@JoinColumn(name = "aid") // Specifies the column that will be used for joining the two tables
	private Answer ans;

	// Getter and Setter methods for 'ans'
	public Answer getAns() {
		return ans;
	}

	public void setAns(Answer ans) {
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
