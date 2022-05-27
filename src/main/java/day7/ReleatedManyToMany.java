package day7;
import day7.model.Employees;
import day7.model.Office;
import org.hibernate.Session;

import java.util.HashSet;
import java.util.Set;

public class ReleatedManyToMany {
    public static void main(String[] args) {
        Session session = RelatedHibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        Employees readEmployee = session.find(Employees.class, 1L);

        System.out.println(readEmployee);

        session.getTransaction().commit();



        session.beginTransaction();
        Office updateProject = session.find(Office.class, 1L);
        updateProject.setName("name");
        session.update(updateProject);
        session.getTransaction().commit();

        session.beginTransaction();
        Employees read = session.find(Employees.class, 1L);
        System.out.println(read);

        session.getTransaction().commit();

        session.close();
    }
}