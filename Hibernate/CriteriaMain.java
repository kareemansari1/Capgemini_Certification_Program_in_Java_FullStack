package mavenproject.HibernateMapping;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class CriteriaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		// Step 2: Open a session from the SessionFactory
		Session session = sf.openSession();

		// Step 3: Begin a transaction
		Transaction transaction = session.beginTransaction();
		// Student123 stu = new Student123("Kareem", "Nashik");
		// session.save(stu);

		Student123 stu1 = new Student123("Ritesh", "Pune");
		// session.save(stu1);
		// Student123 stu2 = new Student123("Onkar","Kolhapur");
		// session.save(stu2);

		Student123 stu3 = new Student123("Onkar", "Solhapur");
		// session.save(stu3);

		Criteria criteria = session.createCriteria(Student123.class);
		List<Student123> stdList = criteria.list();
		for (Student123 std : stdList) {
			System.out.println(std);
		}
		long count = (Long) session.createCriteria(Student123.class).setProjection(Projections.rowCount())
				.add(Restrictions.like("sname", "%i%")).uniqueResult();// check sname in between i.
		System.out.println("Number of employees with 'i' in name=" + count);
		long count1 = (Long) session.createCriteria(Student123.class).setProjection(Projections.rowCount())
				.add(Restrictions.like("scity", "P%")).uniqueResult();// check scity in Pune.
		System.out.println("Number of employees with 'pune' in city=" + count1);
		long sumid = (Long) session.createCriteria(Student123.class).setProjection(Projections.sum("sid"))
				.uniqueResult();
		System.out.println("Sum of id=" + sumid);
		double avg = (Double) session.createCriteria(Student123.class).setProjection(Projections.avg("sid"))
				.uniqueResult();
		System.out.println("Sum of avg=" + avg);
		Criteria cr1 = session.createCriteria(Student123.class);
		cr1.setProjection(Projections.rowCount());
		List rowcount = cr1.list();
		System.out.println("Number of Data Row Count : " + rowcount.get(0));
		cr1.setProjection(Projections.countDistinct("scity"));
		List citycount = cr1.list();
		System.out.println("Number of Distinct City is : " + citycount);
		// cr1.setProjection(Projections.("scity"));

		transaction.commit();

	}

}
