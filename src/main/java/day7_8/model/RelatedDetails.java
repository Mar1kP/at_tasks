package day7_8.model;
import javax.persistence.*;
import java.util.Date;

public class RelatedDetails {
    @Id
    private String id_email;
    private Integer age;
    private Date db;
    private String post;
    private Integer phone;


    @OneToOne
    @JoinColumn(name = "employee_id")
    private RelatedEmployees relatedEmployees;

    public void setRelatedEmployees(RelatedEmployees relatedEmployees) {
        this.relatedEmployees = relatedEmployees;
    }

    public String getId_email() {
        return id_email;
    }

    public void setId_email(String id_email) {
        this.id_email = id_email;
    }

    public Date getDb() {
        return db;
    }

    public void setDb(Date db) {
        this.db = db;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String post() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
    public Integer phone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "RelatedDetails{" +
                "id_email=" + id_email +
                ", age='" + age + '\'' +
                ", db='" + db + '\'' +
                ", post='" + post + '\'' +
                ", phone=" + phone +
                '}';
    }
}
