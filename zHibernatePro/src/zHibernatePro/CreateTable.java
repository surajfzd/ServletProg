package zHibernatePro;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateTable {

	public static void main(String[] args) {
		 SessionFactory factory;

		factory = new Configuration().configure().buildSessionFactory();

		if (factory != null) {
			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();
			UserDetails user = new UserDetails();
			user.setUserName("user 1");
			session.save(user);

			tx.commit();
			session.close();

			

		} else
			System.out.println("Session factory is null");
}
}