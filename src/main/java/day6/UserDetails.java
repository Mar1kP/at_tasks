package day6;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user_details")

public class UserDetails {
    //CREATE TABLE `aqa_it_step_4at`.`user_details` (
    //  `id_email` VARCHAR(45) NOT NULL,
    //  `age` INT NOT NULL,
    //  `db` DATE NOT NULL,
    //  `phone` VARCHAR(45) NOT NULL,
    //  `post` VARCHAR(60) NULL,
    //  `employee_id` INT,
    //  PRIMARY KEY (`id_email`));
    @Id

    private String id_email;
    private Integer age;
    private Date db;
    private String post;
    private Integer phone;
    private Integer employee_id;

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
    public Integer employee_id() {
        return employee_id;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }



}
