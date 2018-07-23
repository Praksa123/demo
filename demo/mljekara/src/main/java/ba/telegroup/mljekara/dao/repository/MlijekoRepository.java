package ba.telegroup.mljekara.dao.repository;

import ba.telegroup.mljekara.model.Mlijeko;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MlijekoRepository extends JpaRepository<Mlijeko, Integer> {
    List<Mlijeko> getAllByActive(byte active);

}
