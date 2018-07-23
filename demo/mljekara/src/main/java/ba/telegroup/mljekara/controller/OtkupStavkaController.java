package ba.telegroup.mljekara.controller;

import ba.telegroup.mljekara.dao.repository.OtkupStavkaRepository;
import ba.telegroup.mljekara.model.OtkupStavka;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/otkupstavka")
@Scope("request")
public class OtkupStavkaController {
    @Autowired
    private OtkupStavkaRepository otkupStavkaRepository;

    @RequestMapping(value="getAll", method = RequestMethod.GET)
    public List<OtkupStavka> getAll(){
        List<OtkupStavka> stavke = otkupStavkaRepository.getAllByActive((byte) 1);
        return stavke;
    }
    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public OtkupStavka getById (@PathVariable("id") int id) throws Exception {
        OtkupStavka stavka = otkupStavkaRepository.getByIdAndActive(id,(byte) 1);
        return stavka;
    }
}
