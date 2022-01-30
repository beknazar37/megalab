package kg.megacom.springbootdemo.dao;

import kg.megacom.springbootdemo.models.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRep extends JpaRepository<Position,Long> {
}
