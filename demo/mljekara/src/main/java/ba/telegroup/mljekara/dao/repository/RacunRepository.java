package ba.telegroup.mljekara.dao.repository;

import ba.telegroup.mljekara.model.Racun;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RacunRepository extends JpaRepository<Racun,Integer> {
    List<Racun> getAllByActive(byte active);
}
