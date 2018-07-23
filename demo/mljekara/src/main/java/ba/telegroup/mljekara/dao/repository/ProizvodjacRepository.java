package ba.telegroup.mljekara.dao.repository;

import ba.telegroup.mljekara.model.Proizvodjac;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProizvodjacRepository extends JpaRepository<Proizvodjac,Integer> {
        List<Proizvodjac> getAllByActive(byte active);
        Proizvodjac getByIdAndActive(int id, byte active);
    }

