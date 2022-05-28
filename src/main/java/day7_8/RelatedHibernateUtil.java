package day7_8;

import day7_8.model.Employees;
import day7_8.model.Office;
import day7_8.model.RelatedDetails;
import day7_8.model.RelatedEmployees;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class RelatedHibernateUtil {
    private static SessionFactory sessionFactory;

    static SessionFactory getSessionFactory(){
        if(sessionFactory == null){
            sessionFactory = initSessionFactory();
        }
        return sessionFactory;
    }

    private static SessionFactory initSessionFactory() {
        Configuration configuration = new Configuration();
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src/main/resources/config.properties"));
            configuration.setProperties(properties);
        } catch (IOException e) {
            e.printStackTrace();
        }

        configuration.addAnnotatedClass(RelatedDetails.class);
        configuration.addAnnotatedClass(RelatedEmployees.class);
        configuration.addAnnotatedClass(Employees.class);
        configuration.addAnnotatedClass(Office.class);

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties()).build();
        System.out.println("Hibernate Java Config serviceRegistry created");

        return configuration.buildSessionFactory(serviceRegistry);
    }
}