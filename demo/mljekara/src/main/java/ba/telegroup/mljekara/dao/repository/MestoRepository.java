package ba.telegroup.mljekara.dao.repository;

import ba.telegroup.mljekara.model.Mesto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MestoRepository extends JpaRepository <Mesto,Integer> {
    List<Mesto> getAllByActive(byte active);
    Mesto getByIdAndActive(int id, byte active);
}
