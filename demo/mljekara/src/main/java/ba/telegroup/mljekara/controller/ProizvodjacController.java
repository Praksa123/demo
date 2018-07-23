package ba.telegroup.mljekara.controller;

import ba.telegroup.mljekara.dao.repository.ProizvodjacRepository;
import ba.telegroup.mljekara.model.Proizvodjac;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/proizvodjac")
@Scope("request")
public class ProizvodjacController {
    @Autowired
    ProizvodjacRepository proizvodjacRepository;

    // vrati sve proizvodjace
    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<Proizvodjac> getAll() {
        List<Proizvodjac> proizvodjaci = proizvodjacRepository.getAllByActive((byte) 1);
        return proizvodjaci;
    }

    //vrati aktivne proizvodjace na osnovu id-a
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Proizvodjac getById(@PathVariable("id") int id) throws Exception {
        Proizvodjac proizvodjac = proizvodjacRepository.getByIdAndActive(id, (byte) 1);
        return proizvodjac;
    }
}
