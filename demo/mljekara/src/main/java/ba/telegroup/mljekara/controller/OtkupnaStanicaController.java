package ba.telegroup.mljekara.controller;

import ba.telegroup.mljekara.dao.repository.OtkupnaStanicaRepository;
import ba.telegroup.mljekara.model.OtkupnaStanica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/otkupnastanica")
@Scope("request")
public class OtkupnaStanicaController {
    @Autowired
    private OtkupnaStanicaRepository isporukaStavkaRepository;

    @RequestMapping(value = "/getAll" , method = RequestMethod.GET)
    public List<OtkupnaStanica> getAll(){
        List<OtkupnaStanica> stanice = isporukaStavkaRepository.getAllByActive((byte) 1);
        return stanice;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public OtkupnaStanica getById(@PathVariable("id") int id) throws Exception {
        OtkupnaStanica stanica = isporukaStavkaRepository.getByIdAndActive(id, (byte) 1);
        return stanica;
    }
}
