package onetooneubidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main1 {
	public static void main(String[] args) {
		// Step 1: Create a SessionFactory object
		// Configuration().configure() loads the configuration settings from
		// hibernate.cfg.xml
		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		// Step 2: Open a session from the SessionFactory
		Session session = sf.openSession();

		// Step 3: Begin a transaction
		Transaction transaction = session.beginTransaction();

		// Step 4: Create and set up the Question1 object
		Question1 question = new Question1();
		question.setQname("How Are You?");

		// Step 5: Create and set up the Answer1 object
		Answer1 answer = new Answer1();
		answer.setAid(101);
		answer.setAname("I am Fine");
		answer.setQue1(question);

		// Step 6: Set the answer for the question (bidirectional relationship)
		question.setAns(answer);

		// Step 7: Save the Question1 and Answer1 objects to the database
		session.save(question);
		session.save(answer);

		// Step 8: Commit the transaction
		transaction.commit();

		// Step 9: Close the session
		session.close();

		// Step 10: Close the SessionFactory
		sf.close();
	}
}
