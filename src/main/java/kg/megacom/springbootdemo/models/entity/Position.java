package kg.megacom.springbootdemo.models.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "/positions")
public class Position {
    private Long id;
    private String title;

}
