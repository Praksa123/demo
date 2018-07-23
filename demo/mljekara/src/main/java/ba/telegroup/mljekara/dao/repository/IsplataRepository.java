package ba.telegroup.mljekara.dao.repository;

import ba.telegroup.mljekara.model.Isplata;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IsplataRepository extends JpaRepository<Isplata,Integer> {
    List<Isplata> getAllByActive(byte active);
    Isplata getByIdAndActive(int id, byte active);
    }


