package day7_8;

import day7_8.model.Office;
import day7_8.model.RelatedEmployees;
import org.hibernate.Session;

public class ReleatedOneToMany {

    public static void main(String[] args) {
        Session session = RelatedHibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        RelatedEmployees employees = session.find(RelatedEmployees.class, 1L);

        session.getTransaction().commit();

        session.beginTransaction();
        Office updateOffice = session.find(Office.class, 3L);
        updateOffice.setName("name1");
        session.update(updateOffice);
        session.getTransaction().commit();

        session.beginTransaction();
        Office updateReadOffice = session.find(Office.class, 3L);

        session.getTransaction().commit();

        session.beginTransaction();
        Office deleteOffice = session.find(Office.class, 2L);
        session.delete(deleteOffice);

        session.getTransaction().commit();

        session.beginTransaction();

        session.getTransaction().commit();

        session.close();

    }
}