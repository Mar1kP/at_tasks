package day7.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "employees")
public class Employees<Office> {
    //CREATE TABLE `aqa_it_step_4at`.`employees` (
    //  `employee_id` INT NOT NULL AUTO_INCREMENT,
    //  `name` VARCHAR(45) NOT NULL,
    //  `surname` VARCHAR(45) NOT NULL,
    //  `office` VARCHAR(60) NOT NULL,
    //  PRIMARY KEY (`employee_id`));
    //
    @Id
    private Integer employee_id;
    private String name;
    private String surname;
    private String office;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            joinColumns = { @JoinColumn(name = "employee_id") },
            inverseJoinColumns = { @JoinColumn(name = "project_id") }
    )
    Set<Office> projects = new HashSet<>();

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

    public void setProjects(Set<Office> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employee_id=" + employee_id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", office=" + office +
                '}';
    }


}
