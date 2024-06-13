package onetooneunidirection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		// Step 1: Create a SessionFactory object
		// Configuration().configure() loads the configuration settings from
		// hibernate.cfg.xml
		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		// Step 2: Open a session from the SessionFactory
		Session s = sf.openSession();

		// Step 3: Begin a transaction
		Transaction t = s.beginTransaction();

		// Step 4: Create and set up the Question1 object
		Question q = new Question();
		q.setQname("How Are You?");

		// Step 5: Create and set up the Answer1 object
		Answer ans = new Answer();
		ans.setAid(101);
		ans.setAname("I am Fine");

		// Step 6: Set the answer for the question (unidirectional relationship)
		q.setAns(ans); // Extra column created in the Question1 table to hold the Answer1's ID

		// Step 7: Save the Question1 and Answer1 objects to the database
		s.save(q);
		s.save(ans);

		// Step 8: Commit the transaction
		t.commit();

		// Step 9: Close the session
		s.close();

		// Step 10: Close the SessionFactory
		sf.close();
	}
}
