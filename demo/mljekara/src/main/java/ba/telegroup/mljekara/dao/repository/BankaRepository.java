package ba.telegroup.mljekara.dao.repository;

import ba.telegroup.mljekara.model.Banka;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by milicaavramovic on 7/9/2018.
 */
public interface BankaRepository extends JpaRepository<Banka,Integer> {
    List<Banka> getAllByActive(byte active);
    Banka getByIdAndActive(int id, byte active);
}
