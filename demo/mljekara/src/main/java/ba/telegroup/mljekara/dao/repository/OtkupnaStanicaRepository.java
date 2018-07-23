package ba.telegroup.mljekara.dao.repository;

import ba.telegroup.mljekara.model.OtkupnaStanica;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OtkupnaStanicaRepository extends JpaRepository<OtkupnaStanica,Integer> {
    List<OtkupnaStanica> getAllByActive(byte active);
    OtkupnaStanica getByIdAndActive(int id, byte active);
}
