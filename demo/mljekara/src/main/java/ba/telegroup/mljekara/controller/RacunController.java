package ba.telegroup.mljekara.controller;

import ba.telegroup.mljekara.dao.repository.RacunRepository;
import ba.telegroup.mljekara.model.Racun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/racun")
@Scope

public class RacunController {
    @Autowired
    RacunRepository racunRepository;

    // vrati sve racune

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<Racun> getAll(){
        List<Racun> racuni = racunRepository.getAllByActive((byte) 1);
        return racuni;
    }
}
