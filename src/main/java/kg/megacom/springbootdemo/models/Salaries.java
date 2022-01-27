package kg.megacom.springbootdemo.models;

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
