package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class map {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        //creating question
        question q1=new question();
        q1.setQuestionid(101);
        q1.setQuestion("what is java");
        //creating answer
        Answer answer=new Answer();
        answer.setAnswerid(102);
        answer.setAnswer("java is programming languguge");

        question q2=new question();
        q2.setQuestionid(103);
        q2.setQuestion("what is collection");
        //creating answer
        Answer answer1=new Answer();
        answer1.setAnswerid(104);
        answer1.setAnswer("is a api to work with object ");
        Session s=factory.openSession();
        Transaction tx=s.beginTransaction();
        s.save(q1);
        s.save(q2);
        s.save(answer);
        s.save(answer1);


tx.commit();
s.close();
factory.close();

    }
}
