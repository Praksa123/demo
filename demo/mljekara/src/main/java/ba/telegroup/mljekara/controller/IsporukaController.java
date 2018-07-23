package ba.telegroup.mljekara.controller;

import ba.telegroup.mljekara.dao.repository.IsporukaRepository;
import ba.telegroup.mljekara.model.Isporuka;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.JoinColumn;
import java.util.List;

@RestController
@RequestMapping("/isporuka")
@Scope
public class IsporukaController {
    @Autowired
    IsporukaRepository isporukaRepository;

    //vrati sve isporuke
    @RequestMapping(value="/getAll",method = RequestMethod.GET)
    public List<Isporuka> getAll(){
        List<Isporuka> isporuke = isporukaRepository.getAllByActive((byte) 1);
        return isporuke;
    }

    //vrati isporuke sa odredjenim id
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Isporuka getById(@PathVariable("id") int id) throws Exception {
        Isporuka isporuka = isporukaRepository.getByIdAndActive(id,(byte) 1);
        return isporuka;
    }
}
