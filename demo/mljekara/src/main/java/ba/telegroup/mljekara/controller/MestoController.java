package ba.telegroup.mljekara.controller;

import ba.telegroup.mljekara.dao.repository.MestoRepository;

import ba.telegroup.mljekara.model.Mesto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mesto")
@Scope("request")
public class MestoController {
    @Autowired
    private MestoRepository mestoRepository;
    //vrati sva mesta
    @RequestMapping(value = "/getAll" , method = RequestMethod.GET)
    public List<Mesto> getAll(){
        List<Mesto> mesta = mestoRepository.getAllByActive((byte) 1);
        return mesta;
    }

    //vrati aktivno mesto na osnovu id-a
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Mesto getById(@PathVariable("id") int id) throws Exception {
        Mesto mesto = mestoRepository.getByIdAndActive(id, (byte) 1);
        return mesto;
    }
}
