package kg.megacom.springbootdemo.dao;

import kg.megacom.springbootdemo.models.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRep extends JpaRepository<Address, Long> {

}
