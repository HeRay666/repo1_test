package com.itcast.test;

import com.itcast.domain.Customer;
import com.itcast.utils.JpaUtils;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaTest {
//    private EntityManagerFactory myJpa;
//    @Before
//    public void setUp(){
//        myJpa = (EntityManagerFactory) JpaUtils.getEntityManager();
//    }
    @Test
    public void test(){
//        EntityManager em = myJpa.createEntityManager();
        EntityManager em = JpaUtils.getEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        Customer customer = new Customer();
        customer.setCustName("nihao");
        em.persist(customer);
        tx.commit();

        em.close();
//        myJpa.close();
    }
}
