package ba.telegroup.mljekara.dao.repository;

import ba.telegroup.mljekara.model.OtkupStavka;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OtkupStavkaRepository extends JpaRepository<OtkupStavka, Integer> {
    List<OtkupStavka> getAllByActive(byte active);
    OtkupStavka getByIdAndActive(int id, byte active);
}
