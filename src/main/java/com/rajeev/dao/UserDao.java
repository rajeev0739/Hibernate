package com.rajeev.dao;

import org.hibernate.Session;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;

import com.rajeev.persistent.User;  
  
public class UserDao {  
  
public static int register(User u){  
	 int i=0;  
	 Transaction t=null;
	try {
			
			 System.out.println("user :"+u.toString());
			 Session session=new Configuration().configure().buildSessionFactory().openSession();          
			  t=session.getTransaction(); 
			  t.begin();  
			  i=(Integer)session.save(u);  
			  t.commit();  
			  session.close();  
			  System.out.println("i="+u.toString());
			 
		}catch(Exception e) {
			 t.rollback();
		     System.out.println("get failed"+ e);
		}
	 return i;  
}
}