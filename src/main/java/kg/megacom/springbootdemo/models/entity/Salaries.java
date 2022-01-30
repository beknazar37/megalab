package kg.megacom.springbootdemo.models.entity;

import kg.megacom.springbootdemo.models.entity.Employee;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "/salaries")
public class Salaries {
    private Long id;
    private int amount;
    private Employee employee;

}
