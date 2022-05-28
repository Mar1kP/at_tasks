package day7_8;
import day7_8.model.Employees;
import day7_8.model.Office;
import org.hibernate.Session;

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