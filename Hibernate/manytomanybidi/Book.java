package manytomanybidi;

import javax.persistence.*;
import java.util.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long bid;
    private String bname;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "book_author",
        joinColumns = { @JoinColumn(name = "book_id") },
        inverseJoinColumns = { @JoinColumn(name = "author_id") })
    private List<Author> authors = new ArrayList<Author>();

    // Getters and setters
    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Long getBid() {
        return bid;
    }

    public void setBid(Long bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", authors=" + authors + "]";
	}

	public Book( String bname, List<Author> authors) {
		super();
		
		this.bname = bname;
		this.authors = authors;
	}

	public Book() {
		super();
		
	}
	
    
}
