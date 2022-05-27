package day7.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "empOffice")

public class Office {
    @Id


    private Integer office_id;
    private String name;



    @ManyToMany(mappedBy = "empOffice")
    private Set<Employees> employees = new HashSet<>();

    public Integer getOffice_id() {
        return office_id;
    }

    public void setOffice_id(Integer office_id) {
        this.office_id = office_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Employees> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employees> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Office{" +
                "office_id=" + office_id +
                ", name='" + name + '\'' +
                '}';
    }
}
