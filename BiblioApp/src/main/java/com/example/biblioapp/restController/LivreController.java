package com.example.biblioapp.restController;

import com.example.biblioapp.Repository.LivreRepo;
import com.example.biblioapp.model.Livre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livre")
public class LivreController {

    @Autowired
    private LivreRepo repository;

    @GetMapping
    public List<Livre> getAllBooks(){
      return repository.findAll();
    }

    @PostMapping
    public Livre  SaveLivre(@RequestBody Livre livre){
        return repository.save(livre) ;
    }


}
