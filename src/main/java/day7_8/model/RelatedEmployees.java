package day7_8.model;

import javax.persistence.*;

public class RelatedEmployees {
    @Id
    //CREATE TABLE `aqa_it_step_4at`.`relatedEmployees` (
    //   `employee_id` INT NOT NULL AUTO_INCREMENT,
    //   `name` VARCHAR(45) NOT NULL,
    //   `surname` VARCHAR(45) NOT NULL,
    //   `office` VARCHAR(60) NOT NULL,
    //   `id_email` INT NOT NULL,
    //   PRIMARY KEY (`id_cars`));
    private Integer employee_id;
    private String name;
    private String surname;
    private String office;

    @OneToOne
    @JoinColumn(name = "id_cars")
    private RelatedDetails relatedDetails;


    public Integer getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getOffice() {
        return office;
    }

    @Override
    public String toString() {
        return "RelatedEmployee{" +
                "employee_id=" + employee_id +
                ", name='" + name + '\'' +
                ", surname=" + surname +
                ", office=" + office +
                '}';
    }


}
