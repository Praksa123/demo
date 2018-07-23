package ba.telegroup.mljekara.controller;

import ba.telegroup.mljekara.dao.repository.BankaRepository;
import ba.telegroup.mljekara.model.Banka;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by milicaavramovic on 7/9/2018.
 */

@RestController
@RequestMapping("/banka")
@Scope("request")
public class BankaController {

    @Autowired
    private BankaRepository bankaRepository;

    //vrati sve aktivne banke
    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<Banka> getAll() {
        List<Banka> banke = bankaRepository.getAllByActive((byte) 1);
        return banke;
    }

    //vrati aktivnu banku na osnovu id-a
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Banka getById(@PathVariable("id") int id) throws Exception {
        Banka banka = bankaRepository.getByIdAndActive(id, (byte) 1);
        return banka;
    }
}
