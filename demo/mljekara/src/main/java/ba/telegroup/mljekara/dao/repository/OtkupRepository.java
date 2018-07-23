package ba.telegroup.mljekara.dao.repository;

import ba.telegroup.mljekara.model.Otkup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OtkupRepository extends JpaRepository<Otkup,Integer> {
    List<Otkup> getAllByActive(byte active);

}
