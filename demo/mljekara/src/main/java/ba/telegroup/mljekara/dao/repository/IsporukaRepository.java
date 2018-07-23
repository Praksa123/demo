package ba.telegroup.mljekara.dao.repository;

import ba.telegroup.mljekara.model.Isporuka;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IsporukaRepository extends JpaRepository<Isporuka,Integer> {
    List<Isporuka> getAllByActive(byte active);
    Isporuka getByIdAndActive(int id, byte active);
}
