package com.classes;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e=new Employee(1,"Anil",50000,"anil@xyz.com","IT");
		System.out.println(e);
		Configuration config=null;
		SessionFactory factory=null;
		Transaction transaction=null;
		Session session=null;
		
			try
			{
			config=new Configuration();
			 //System.out.println("check here");
			config.configure("hibernate.cfg.xml");
			
			// System.out.println("check here");
		    factory=config.buildSessionFactory();
		  //  System.out.println("check here");
			session=factory.openSession();
			 transaction=session.beginTransaction();
			// System.out.println("check here");
			 session.save(e);
			 transaction.commit();
			 session.clear();
			 session.close();
			 System.out.println("---Transaction Committed");
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				System.out.println("------Some Exception");
			}

	}

}
