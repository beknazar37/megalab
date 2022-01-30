package kg.megacom.springbootdemo.mappers;

import kg.megacom.springbootdemo.models.entity.Employee;
import kg.megacom.springbootdemo.models.dto.EmployeeDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {
    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);
    Employee toEmployee(EmployeeDto employeeDto);
    EmployeeDto toEmployeeDto(Employee employee);



}
