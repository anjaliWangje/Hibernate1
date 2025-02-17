package org.example;

import org.hibernate.Session;
import org.hibernate.SessionBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      // Configuration cfg=new Configuration();
       // cfg.configure("hibernate.cfg.xml");
      // SessionFactory ss =cfg.buildSessionFactory();

       //creating student
       // Student st=new Student();
       // st.setId(101);
       // st.setName("anjali");
       // st.setCity("latur");
       // System.out.println(st);




        SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Student st=new Student();
        st.setId(101);
        st.setName("anjali");
        st.setCity("latur");
        System.out.println(st);

       Session ss= sf.openSession();
     // Transaction trx= ss.beginTransaction();

       // trx.commit();
        ss.close();
        sf.close();


    }
}
