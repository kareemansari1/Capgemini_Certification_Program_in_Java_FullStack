package mavenproject.HibernateMapping;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Main class for Hibernate mapping operations.
 */
public class App {
	public static void main(String[] args) {
		// Print a welcome message
		System.out.println("Hello World!");

		// Configure and build the SessionFactory
		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		// Open a session
		Session s = sf.openSession();

		// Initialize a transaction
		Transaction tr = null;
		tr = s.beginTransaction();

		// Insert operations (currently commented out)
		/*
		 * Student123 stu = new Student123("Kareem", "Nashik"); s.save(stu); Student123
		 * stu1 = new Student123("Onkar", "Kolhapur"); s.save(stu1);
		 */

		// Delete operation (currently commented out)
		/*
		 * Student123 student123 = new Student123(); student123.setSid(5);
		 * s.delete(student123); System.out.println("Record Deleted Successfully");
		 */

		// Update operation (currently commented out)
		/*
		 * Student123 student123 = new Student123(); student123.setSid(3);
		 * student123.setSname("Nitesh"); student123.setScity("Pune");
		 * s.update(student123); System.out.println("Record Updated Successfully");
		 */

		// List all students (currently commented out)
		/*
		 * Query q = s.createQuery("from Student123"); List<Student123> li = q.list();
		 * for (Student123 bk : li) { System.out.println(bk); }
		 */

		// Query to list students ordered by name (sname)
		Query q1 = s.createQuery("from Student123 ORDER BY sname");
		List<Student123> li2 = q1.list();
		for (Student123 bk : li2) {
			System.out.println(bk);
		}

		// Query to list students ordered by city (scity) (currently commented out)
		/*
		 * Query q2 = s.createQuery("from Student123 ORDER BY scity"); List<Student123>
		 * li1 = q2.list(); for (Student123 bk : li1) { System.out.println(bk); }
		 */

		// Query to count the total number of students
		Query countQuery = s.createQuery("select count(*) from Student123");
		Long count = (Long) countQuery.uniqueResult();
		System.out.println("Total number of students: " + count);

		// Query to group students by city and count them
		String hql = "SELECT scity, count(*) FROM Student123 GROUP BY scity";
		Query query = s.createQuery(hql);
		List<Object[]> cityGroups = query.list();
		System.out.println("Students grouped by city:");
		for (Object[] group : cityGroups) {
			System.out.println("City: " + group[0] + ", Count: " + group[1]);
		}

		// Commit the transaction
		tr.commit();

		// Close the session and session factory
		s.close();
		sf.close();
	}
}
