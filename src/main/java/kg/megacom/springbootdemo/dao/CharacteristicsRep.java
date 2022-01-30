package kg.megacom.springbootdemo.dao;

import kg.megacom.springbootdemo.models.entity.Characteristics;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacteristicsRep extends JpaRepository<Characteristics,Long> {
}
