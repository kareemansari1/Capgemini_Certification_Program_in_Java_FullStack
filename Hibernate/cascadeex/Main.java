package cascadeex;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {
//	private static final EntityManagerFactory emFactoryObj;
//  private static final String PERSISTENCE_UNIT_NAME = "JPADemo";
//
//  static {
//      emFactoryObj = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
//  }
//
//  // This Method Is Used To Retrieve The 'EntityManager' Object
//  public static EntityManager getEntityManager() {
//      return emFactoryObj.createEntityManager();
//  }
  
	public static void main(String[] args) {
		EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		
		Mobile m = new Mobile();
		m.setMid(3);
		m.setMno("223456789");
		Mobile m1 = new Mobile();
		m1.setMid(4);
		m1.setMno("887654321");
		
		Learner l = new Learner();
		//l.setLid(101);
		l.setLname("Soham");
		m.setL(l);
		m1.setL(l);
		
		List<Mobile> mlist = new ArrayList<Mobile>();
		mlist.add(m);
		mlist.add(m1);
		l.setMlist(mlist);
		entityManager.persist(l);
		entityManager.getTransaction().commit();
		entityManager.close();
		
	}

}
