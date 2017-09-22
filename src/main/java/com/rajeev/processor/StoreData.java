package com.rajeev.processor;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.rajeev.annotated.persistent.*;;  
  
public class StoreData {  
public static void main(String[] args) {  
      
    //creating configuration object  
    //Configuration cfg=new Configuration();  
   // cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
      
    //creating session factory object  
   // SessionFactory factory=cfg.buildSessionFactory();  
      
    //creating session object  
    //Session session=factory.openSession();  
    
    Session session=new AnnotationConfiguration().configure().buildSessionFactory().openSession();  
      
    //creating transaction object  
    Transaction t=session.beginTransaction();  
          
    Employee e1=new Employee();  
    e1.setId(119);  
    e1.setFirstName("Rajeev");  
    e1.setLastName("Singh");  
      
    session.persist(e1);//persisting the object  
      
    t.commit();//transaction is committed  
    session.close();  
      
    System.out.println("successfully saved");  
      
}  
}  
