package kg.megacom.springbootdemo.models.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "/Characteristics")
public class Characteristics {
    private String education;
    private Date dateEmployment;
    private Employee employee;
    private Address address;
    private Salaries salaries;
    private Position position;

}
