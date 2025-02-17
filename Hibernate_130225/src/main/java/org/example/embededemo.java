package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class embededemo {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
         cfg.configure("hibernate.cfg.xml");
         SessionFactory ss =cfg.buildSessionFactory();
         Student Student1=new Student();
         Student1.setId(101);
         Student1.setName("anjali wangje");
         Student1.setCity("latur");

         certificate certificate1=new certificate();
         certificate1.setCourse("java");
         certificate1.getDuration("5 month");
         Student1.setCerti(certificate1);
        Student Student2=new Student();
        Student2.setId(102);
        Student2.setName("pranali wangje");
        Student2.setCity("ausa");


        certificate certificate2=new certificate();
        certificate2.setCourse("react");
        certificate2.getDuration("6 month");
        Student2.setCerti(certificate2);

        Session st= ss.openSession();
       Transaction trx= st.beginTransaction();
        st.save(Student1);
        st.save(Student2);

        trx.commit();
        ss.close();
        st.close();





         
    }
}
