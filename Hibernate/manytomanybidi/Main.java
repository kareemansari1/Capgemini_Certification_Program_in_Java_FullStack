package manytomanybidi;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
    	SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();

        //create books
        Book book = new Book();
        book.setBname("Java");
        
        Book book1 = new Book();
        book1.setBname("HTML");
        
        // Create a new author
        Author author = new Author();
        author.setAname("Bronz");
        
        Author author1 = new Author();
        author1.setAname("Cronz");
        
        book.getAuthors().add(author);
        book1.getAuthors().add(author1);
        
        author.getBlist().add(book);
        author1.getBlist().add(book1);
        

        // Update both sides of the relationship
       //author.addBook(book);

        // Persist entities
        s.persist(book);
        s.persist(book1);
        s.persist(author);
        s.persist(author1);
        
     // print books and their authors
//        List<Book> books = s.createQuery("FROM Book", Book.class).list();
//        for (Book b : books) {
//            System.out.println("Book: " + b.getBname());
//            for (Author a : b.getAuthors()) {
//                System.out.println("  Author: " + a.getAname());
//            }
//        }

        s.getTransaction().commit();
        sf.close();
        s.close();
       
    }

	
}
