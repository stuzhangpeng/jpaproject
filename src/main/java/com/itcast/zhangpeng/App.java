package com.itcast.zhangpeng;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

       save1();
    }

    private static void find() {
        //查找客户
        String jpa = "jpa";
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(jpa);
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        //开启事务
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        User user = entityManager.find(User.class, 8);
        System.out.println(user
        );
        transaction.commit();

    }

    private static void save1() {
        String jpa = "jpa";
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(jpa);
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        //开启事务
        EntityTransaction transaction = entityManager.getTransaction();
        User u = new User();
        u.setName("网易");
        Customer customer = new Customer();
        Customer customer1 = new Customer();
        customer.setCust_name("baidu");
        customer1.setCust_name("xinlang");
        Set<Customer> set = new HashSet<Customer>();
        set.add(customer);
        set.add(customer1);
        u.setCustomers(set);
        customer.setUser(u);
        customer1.setUser(u);
        transaction.begin();
       /* entityManager.persist(customer);
        entityManager.persist(customer1);*/
        entityManager.persist(u);
        transaction.commit();
    }
}
