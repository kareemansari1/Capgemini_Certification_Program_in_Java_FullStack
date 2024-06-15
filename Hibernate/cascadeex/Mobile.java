package cascadeex;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Mobile {
	@Id
	private int mid;
	private String mno;
	
	@ManyToOne
	private Learner l;

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMno() {
		return mno;
	}

	public void setMno(String mno) {
		this.mno = mno;
	}

	public Learner getL() {
		return l;
	}

	public void setL(Learner l) {
		this.l = l;
	}
	
	
	
	
	

}
