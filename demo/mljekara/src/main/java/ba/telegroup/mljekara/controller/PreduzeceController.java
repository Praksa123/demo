package ba.telegroup.mljekara.controller;


import ba.telegroup.mljekara.dao.repository.PreduzeceRepository;
import ba.telegroup.mljekara.model.Preduzece;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/preduzece")
@Scope("request")
public class PreduzeceController {
    @Autowired
    PreduzeceRepository preduzeceRepository;

    // vrati sva preduzeca

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<Preduzece> getAll() {
        List<Preduzece> preduzeca = preduzeceRepository.getAllByActive((byte) 1);
        return preduzeca;
    }

    //vrati aktivno preduzece na osnovu id-a
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Preduzece getById(@PathVariable("id") int id) throws Exception {
        Preduzece preduzece = preduzeceRepository.getByIdAndActive(id, (byte) 1);
        return preduzece;
    }
}
