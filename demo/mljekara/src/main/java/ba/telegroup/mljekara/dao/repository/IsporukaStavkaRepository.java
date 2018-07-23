package ba.telegroup.mljekara.dao.repository;

import ba.telegroup.mljekara.model.IsporukaStavka;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IsporukaStavkaRepository extends JpaRepository<IsporukaStavka,Integer> {
        List<IsporukaStavka> getAllByActive(byte active);
        IsporukaStavka getByIdAndActive(int id, byte active);
}
