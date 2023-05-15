package co.develhope.springrepositories2.controllers;

import co.develhope.springrepositories2.entities.ProgrammingLanguage;
import co.develhope.springrepositories2.repositories.ProgrammingLanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    ProgrammingLanguageRepository programmingLanguageRepository;

    @PostMapping("/create")
    public ProgrammingLanguage create(@RequestBody ProgrammingLanguage programmingLanguage){
        return programmingLanguageRepository.saveAndFlush(programmingLanguage);
    }

    @GetMapping("/get")
    public Page<ProgrammingLanguage> get(){
        Pageable page = PageRequest.of(1, 2);
        return programmingLanguageRepository.findAll(page);
    }

    @PutMapping("/put/{id}")
    public ProgrammingLanguage change(@PathVariable long id){
        ProgrammingLanguage pl = programmingLanguageRepository.getById(id);
        pl.setInventor("Giada");
        return programmingLanguageRepository.saveAndFlush(pl);
    }
}
