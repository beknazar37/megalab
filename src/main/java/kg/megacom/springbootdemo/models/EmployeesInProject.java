package kg.megacom.springbootdemo.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "EmployeesInProjects")
public class EmployeesInProject {
    private Long id;
    private Employee employee;
    private Project project;
    private Date dateInProject;
}
