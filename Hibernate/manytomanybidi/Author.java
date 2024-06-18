package manytomanybidi;

import javax.persistence.*;
import java.util.*;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long aid;
    private String aname;

    @ManyToMany(mappedBy = "authors")
    private List<Book> blist = new ArrayList<Book>();

    // Getters and setters
    public Long getAid() {
        return aid;
    }

    public void setAid(Long aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public List<Book> getBlist() {
        return blist;
    }

    public void setBlist(List<Book> blist) {
        this.blist = blist;
    }

	public Author() {
		super();
	}

	public Author(String aname, List<Book> blist) {
		super();
		this.aname = aname;
		this.blist = blist;
	}

	@Override
	public String toString() {
		return "Author [aid=" + aid + ", aname=" + aname + ", blist=" + blist + "]";
	}
    
    
}
