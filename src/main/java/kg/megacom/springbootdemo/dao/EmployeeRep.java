package kg.megacom.springbootdemo.dao;

import kg.megacom.springbootdemo.models.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRep extends JpaRepository<Employee, Long> {
}
