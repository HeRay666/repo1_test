package com.itcast.test;

import com.itcast.domain.Customer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.junit.Before;
import org.junit.Test;

public class HibernateTest {
    private SessionFactory emf;
    @Before
    public void init(){
        StandardServiceRegistry build = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        emf = new MetadataSources(build).buildMetadata().buildSessionFactory();
    }
    @Test
    public void test1(){
        //1.加载配置文件创建工厂（实体管理器工厂）对象
//        EntityManagerFactory factory;
//        factory = Persistence.createEntityManagerFactory("myJpa");
//        //2.通过实体管理器工厂获取实体管理器
//        EntityManager em = factory.createEntityManager();
//        EntityManager em = JpaUtils.getEntityManager();
        //创建session
        Session session = emf.openSession();
        //3.获取事务对象，开启事务
        //EntityTransaction tx = session.getTransaction(); //获取事务对象
        Transaction transaction = session.beginTransaction();
//        transaction.begin();//开启事务
        //4.完成增删改查操作：保存一个客户到数据库中
        Customer customer = new Customer();
        customer.setCustName("传智播客");
        customer.setCustIndustry("教育");
        //保存，
        session.save(customer); //保存操作
        //5.提交事务
        transaction.commit();
        //6.释放资源
        session.close();
        emf.close();
    }
}
