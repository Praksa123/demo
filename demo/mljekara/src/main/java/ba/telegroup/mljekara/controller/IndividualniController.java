package ba.telegroup.mljekara.controller;

import ba.telegroup.mljekara.dao.repository.IndividualniRepository;
import ba.telegroup.mljekara.model.Individualni;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/individualni")
@Scope("request")
public class IndividualniController {
    @Autowired
    IndividualniRepository individualniRepository;

    // vrati sve individualne
    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<Individualni> getAll() {
        List<Individualni> individualni = individualniRepository.getAllByActive((byte) 1);
        return individualni;
    }

    //vrati aktivnu banku na osnovu id-a
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Individualni getById(@PathVariable("id") int id) throws Exception {
        Individualni individualni = individualniRepository.getByIdAndActive(id, (byte) 1);
        return individualni;


    }
}
