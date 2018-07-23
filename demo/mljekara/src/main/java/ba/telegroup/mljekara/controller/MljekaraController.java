package ba.telegroup.mljekara.controller;

import ba.telegroup.mljekara.dao.repository.MljekaraRepository;
import ba.telegroup.mljekara.model.Mljekara;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mljekara")
@Scope
public class MljekaraController {
    @Autowired
    MljekaraRepository mljekaraRepository;

    // vrati sve mljekare
    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<Mljekara> getAll(){
        List<Mljekara> mljekare = mljekaraRepository.getAllByActive((byte) 1);
        return mljekare;
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Mljekara getById(@PathVariable("id") int id) throws Exception {
        Mljekara mljekara = mljekaraRepository.getByIdAndActive(id,(byte) 1);
        return mljekara;
    }
}
