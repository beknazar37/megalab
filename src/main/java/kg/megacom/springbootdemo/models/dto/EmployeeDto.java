package kg.megacom.springbootdemo.models.dto;

import kg.megacom.springbootdemo.models.entity.Position;
import lombok.Data;

@Data

public class EmployeeDto {
    private long id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private Position position;


}

