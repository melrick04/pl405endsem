package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;



public class Main {

	public static void main(String[] args) {

		student s1 = new student();
		s1.setStudent_name("Rio");
		
		student_details sd1 = new student_details();
		sd1.setC1("70");
		sd1.setC2("50");
		sd1.setC3("55");
		sd1.setC4("60");
		sd1.setC5("59");
		sd1.setC6("75");
		
		student s2 = new student();
		s2.setStudent_name("Zack");
		
		student_details sd2 = new student_details();
		sd2.setC1("65");
		sd2.setC2("78");
		sd2.setC3("47");
		sd2.setC4("80");
		sd2.setC5("65");
		sd2.setC6("90");
		
		student s3 = new student();
		s3.setStudent_name("Leo");
		
		student_details sd3 = new student_details();
		sd3.setC1("33");
		sd3.setC2("46");
		sd3.setC3("31");
		sd3.setC4("42");
		sd3.setC5("77");
		sd3.setC6("52");
		
		sd1.setStudent(s1);
		sd2.setStudent(s2);
		sd3.setStudent(s3);
		
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(sd1);
		session.save(sd2);
		session.save(sd3);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
