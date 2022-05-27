package day7;
import day7.model.RelatedDetails;
import day7.model.RelatedEmployees;
import org.hibernate.Session;


import java.io.Serializable;

public class RelatedHibertnateMain {
    public static void main(String[] args) {
        Session session = RelatedHibernateUtil.getSessionFactory().openSession();

        RelatedEmployees relatedEmployees = session.find(RelatedEmployees.class, 2L);
//private String id_email;
//    private Integer age;
//    private Date db;
//    private String post;
//    private Integer phone;
        RelatedDetails rDetails = new RelatedDetails();
        rDetails.setId_email("email");
        rDetails.setAge(12);

        rDetails.setPost("asd");
        rDetails.setRelatedEmployees(relatedEmployees);

        session.beginTransaction();
        Serializable id = session.save(rDetails);
        session.getTransaction().commit();
        session.beginTransaction();
        session.update(relatedEmployees);
        session.getTransaction().commit();

        session.beginTransaction();
        RelatedDetails readRDetails = session.find(RelatedDetails.class, id);
        session.getTransaction().commit();


        session.beginTransaction();
        RelatedDetails updateRDetails = session.find(RelatedDetails.class, 3L);

        session.update(updateRDetails);
        session.getTransaction().commit();

        session.beginTransaction();
        RelatedDetails updateReadRDetails = session.find(RelatedDetails.class, 3L);

        session.getTransaction().commit();

        session.beginTransaction();
        RelatedDetails deleteRDetails = session.find(RelatedDetails.class, 3L);
        session.delete(deleteRDetails);

        session.getTransaction().commit();

        session.close();

    }
}