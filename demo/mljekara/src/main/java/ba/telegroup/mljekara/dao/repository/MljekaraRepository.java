package ba.telegroup.mljekara.dao.repository;

import ba.telegroup.mljekara.model.Mljekara;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MljekaraRepository extends JpaRepository<Mljekara,Integer> {
    List<Mljekara> getAllByActive(byte active);
    Mljekara getByIdAndActive(int id, byte active);
}
