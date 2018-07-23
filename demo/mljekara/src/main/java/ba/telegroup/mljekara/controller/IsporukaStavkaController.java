package ba.telegroup.mljekara.controller;



import ba.telegroup.mljekara.dao.repository.IsporukaStavkaRepository;
import ba.telegroup.mljekara.model.IsporukaStavka;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/isporukastavka")
@Scope("request")
public class IsporukaStavkaController {
    @Autowired
    private IsporukaStavkaRepository isporukaStavkaRepository;

    @RequestMapping(value = "/getAll" , method = RequestMethod.GET)
    public List<IsporukaStavka> getAll(){
        List<IsporukaStavka> stavke = isporukaStavkaRepository.getAllByActive((byte) 1);
        return stavke;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public IsporukaStavka getById(@PathVariable("id") int id) throws Exception {
        IsporukaStavka stavka = isporukaStavkaRepository.getByIdAndActive(id, (byte) 1);
        return stavka;
    }
}
