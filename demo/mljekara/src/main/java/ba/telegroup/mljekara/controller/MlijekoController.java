package ba.telegroup.mljekara.controller;


import ba.telegroup.mljekara.dao.repository.MlijekoRepository;
import ba.telegroup.mljekara.model.Mlijeko;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mlijeko")
@Scope("request")
public class MlijekoController {
    @Autowired
    private MlijekoRepository mlijekoRepository;

    //vrati sve vrste mlijeka
    @RequestMapping(value="/getAll", method = RequestMethod.GET)
    public List<Mlijeko> getAll(){
        List<Mlijeko> mlijeka = mlijekoRepository.getAllByActive((byte) 1);
        return mlijeka;
    }
}
