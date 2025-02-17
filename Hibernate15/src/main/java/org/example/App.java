package org.example;

import jakarta.persistence.Transient;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Object SessionFactory;

    public static void main(String[] args )
    {

        SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

       // Configuration cf= new Configuration();
      //  cf.configure("hibernate.cfg.xml");
       // SessionFactory ss=cf.buildSessionFactory();
       //creating user
        user aa=new user();
        aa.setId(101);
        aa.setName("anjali");
        aa.setCity("latur");
        System.out.println(aa);





        Session sr= sf.openSession();
       // Transaction txt=sr.beginTransaction();
       // sr.save(aa);


       // System.out.println(ss);
      //  System.out.println(ss.isClosed());
       // txt.commit();
sr.close();
sf.close();


        //   =new Configuration().configure("hibernate.cgf.xml").buildSessionFactory();

        //Transaction txt
                //=session.beginTransaction();

    }
}
