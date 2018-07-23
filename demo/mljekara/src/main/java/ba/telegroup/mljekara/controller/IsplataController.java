package ba.telegroup.mljekara.controller;



import ba.telegroup.mljekara.dao.repository.IsplataRepository;
import ba.telegroup.mljekara.model.Isplata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/isplata")
@Scope("request")
public class IsplataController {
    @Autowired
    private IsplataRepository isplataRepository;

    //vrati sve aktivne isplate
    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<Isplata> getAll() {
        List<Isplata> isplate = isplataRepository.getAllByActive((byte) 1);
        return isplate;
    }

    //vrati aktivnu isplatu na osnovu id-a
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Isplata getById(@PathVariable("id") int id) throws Exception {
        Isplata isplata = isplataRepository.getByIdAndActive(id, (byte) 1);
        return isplata;

    }
}
