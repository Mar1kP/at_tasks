package day6;
import javax.persistence.*;


@Entity
@Table(name = "employees")
public class Employee {
    //CREATE TABLE `aqa_it_step_4at`.`employees` (
    //  `employee_id` INT NOT NULL AUTO_INCREMENT,
    //  `name` VARCHAR(45) NOT NULL,
    //  `surname` VARCHAR(45) NOT NULL,
    //  `office` VARCHAR(60) NULL,
    //  PRIMARY KEY (`employee_id`));
    @Id

    private Integer employee_id;
    private String name;
    private String surname;
    private String office;




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

    public void setOffice(String office) {
        this.office = office;
    }



    @Override
    public String toString() {
        return "Car{" +
                "employee_id=" + employee_id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", office='" + office + '\'' +
                '}';
    }

}
