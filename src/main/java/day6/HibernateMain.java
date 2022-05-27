package day6;
import org.hibernate.Session;

import java.io.Serializable;

public class HibernateMain {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Employee employee = new Employee();
        employee.setEmployee_id(1);
        employee.setName("Mark");
        employee.setSurname("Pigruh");
        employee.setOffice("ITstep");

        session.beginTransaction();
        Serializable id = session.save(employee);
        session.getTransaction().commit();

        session.beginTransaction();
        Employee readUser = session.find(Employee.class, id);

        session.getTransaction().commit();

        session.beginTransaction();
        Employee updateEmployee = session.find(Employee.class, 2L);
        updateEmployee.setName("mark");
        session.update(updateEmployee);
        session.getTransaction().commit();

        session.beginTransaction();
        Employee updateReadEmployee = session.find(Employee.class, 2L);

        session.getTransaction().commit();

        session.beginTransaction();
        Employee deleteEmployee = session.find(Employee.class, 1L);
        session.delete(deleteEmployee);

        session.getTransaction().commit();

        session.close();
    }
}