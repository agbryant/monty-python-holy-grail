package com.agbryant.montypythonholygrail.controller;


import com.agbryant.montypythonholygrail.entity.Knight;
import com.agbryant.montypythonholygrail.exception.KnightNotFoundException;
import com.agbryant.montypythonholygrail.repository.KnightRepository;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Log4j2
@RestController
public class KnightController {


    private KnightRepository repository;

    @Autowired
    public KnightController(KnightRepository repository) {

        this.repository = repository;
    }


    @RequestMapping("/list-knights")
    public ModelAndView listKnights(Model model) {

        LOG.debug("Calling for Knights");

        Map<String, Object> params = new HashMap<>();
        params.put("knights", getAll());

        return new ModelAndView("list-knights", params);
    }


    public List<Knight> getAll(){

        return repository.getAll();
    }


    @RequestMapping("/knight/{name}")
    public Knight getByName(@PathVariable("name") String name) throws KnightNotFoundException {

        return repository.getByName(name);
    }
}
