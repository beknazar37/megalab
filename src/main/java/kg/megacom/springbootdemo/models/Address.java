package kg.megacom.springbootdemo.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "/addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String town;
    private String street;
    private int houseNum;
    private Employee employee;

}
