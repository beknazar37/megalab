package kg.megacom.springbootdemo.models.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "/projects")
public class Project {
    private Long id;
    private String name;
    private Date start_date;
    private Date end_date;

}
