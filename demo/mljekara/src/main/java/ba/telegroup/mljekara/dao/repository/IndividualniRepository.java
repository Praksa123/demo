package ba.telegroup.mljekara.dao.repository;

import ba.telegroup.mljekara.model.Individualni;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IndividualniRepository extends JpaRepository<Individualni,Integer> {
    List<Individualni> getAllByActive(byte active);
    Individualni getByIdAndActive(int id, byte active);
}
