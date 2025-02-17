package org.example;

import org.hibernate.Session;
import org.hibernate.SessionBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;






 public class App
{
    public static void main( String[] args )
    {
        SessionFactory ss=new Configuration().configure("hibernate.cgf.xml").buildSessionFactory();

        Student st=new Student();
        st.setId(101);
        st.setName("anjali");
        st.setCity("latur");
        System.out.println(st);

        Session sr= ss.openSession();
        Transaction txt=sr.beginTransaction();


        txt.commit();
        sr.close();
        ss.close();

    }

}
