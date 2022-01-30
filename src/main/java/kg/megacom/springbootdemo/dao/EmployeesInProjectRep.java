package kg.megacom.springbootdemo.dao;

import kg.megacom.springbootdemo.models.entity.EmployeesInProject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesInProjectRep extends JpaRepository<EmployeesInProject,Long > {
}
