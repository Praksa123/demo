package ba.telegroup.mljekara.controller;

import ba.telegroup.mljekara.dao.repository.OtkupRepository;
import ba.telegroup.mljekara.model.Otkup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/otkup")
@Scope
public class OtkupController {

    @Autowired
    OtkupRepository otkupRepository;

    // vrati sve otkupe
    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public List<Otkup> getAll(){
        List<Otkup> otkupi = otkupRepository.getAllByActive((byte) 1);
        return otkupi;
    }
}
