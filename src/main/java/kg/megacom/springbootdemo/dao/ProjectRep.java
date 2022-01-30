package kg.megacom.springbootdemo.dao;

import kg.megacom.springbootdemo.models.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRep extends JpaRepository<Project,Long> {
}
