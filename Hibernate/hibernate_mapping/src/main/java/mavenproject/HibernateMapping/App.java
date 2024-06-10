package mavenproject.HibernateMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session s = sf.openSession();
        Transaction tr = null;
        tr=s.beginTransaction();
        Student123 stu= new Student123("Kareem", "Nashik");
        s.save(stu);
        Student123 stu1= new Student123("Onkar", "kolhapur");
        s.save(stu1);
        tr.commit();
        
        
    }
}
