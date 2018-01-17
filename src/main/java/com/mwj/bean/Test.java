package com.mwj.bean;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.io.Serializable;
import java.util.List;

public class Test {

    public static void main(String[] args){


        Configuration configure = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configure.buildSessionFactory();
        Session session = sessionFactory.openSession();
        System.out.println("*****************************************************************");
        //查询
        Staff staff = session.get(Staff.class, "88");
        System.out.println(staff);
        System.out.println("********************************查询多个列*********************************");
          String sql = " select  password,depname from Staff";
        Query query = session.createQuery(sql);
        List list = query.list();
        for (Object obj : list) {
            Object[] objs=(Object[])obj;
            System.out.println(objs[0]+"----"+objs[1]);
        }
        System.out.println("********************************更具条件查询*********************************");
        String sql1 = "from Staff where staffname = ?";
        Query query1 = session.createQuery(sql1);
        query1.setParameter(0, "ww");
        List list1 = query1.list();
        list1.forEach((e) -> System.out.println(e) );

        System.out.println("********************************统计********************************");


        String sql2 = "select count(*) from Staff";
        Query query2 = session.createQuery(sql2);
        Object o = query2.uniqueResult();
        System.out.println(o);

        System.out.println("********************************多条记录********************************");
        String sql3 = "from Staff";
        Query query3 = session.createQuery(sql3);
        List list2 = query3.list();
        list2.forEach((e) -> System.out.println(e) );
        System.out.println("********************************增加********************************");
         Staff staff1 = new Staff();
        staff1.setMyinitial("456889");
        Serializable save = session.save(staff1);
        //开启事务
        Transaction transaction = session.beginTransaction();
        transaction.commit();
        System.out.println(save);

        System.out.println("********************************删除********************************");
        staff1.setMyinitial("8");
         session.delete(staff1);
        session.close();
        sessionFactory.close();




    }
}
