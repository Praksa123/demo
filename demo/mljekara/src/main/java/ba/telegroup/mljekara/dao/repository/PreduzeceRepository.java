package ba.telegroup.mljekara.dao.repository;

import ba.telegroup.mljekara.model.Preduzece;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PreduzeceRepository extends JpaRepository<Preduzece,Integer> {
    List<Preduzece> getAllByActive(byte active);
    Preduzece getByIdAndActive(int id, byte active);
}
