package com.mwj.bean;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

    public static void main(String[] args){


        Configuration configure = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configure.buildSessionFactory();
        Session session = sessionFactory.openSession();

        //查询
        Staff staff = session.get(Staff.class, "88");
        System.out.println(staff);

        session.close();
        sessionFactory.close();


    }
}
