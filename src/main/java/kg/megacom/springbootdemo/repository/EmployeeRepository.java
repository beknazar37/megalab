package kg.megacom.springbootdemo.repository;

import kg.megacom.springbootdemo.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
