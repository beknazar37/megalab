package kg.megacom.springbootdemo.dao;

import kg.megacom.springbootdemo.models.entity.Salaries;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalariesRep extends JpaRepository<Salaries,Long> {
}
