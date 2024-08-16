package com.itcast.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtils {
    private static EntityManagerFactory emf;
    static {
        emf = Persistence.createEntityManagerFactory("jpa");
    }
    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
}
