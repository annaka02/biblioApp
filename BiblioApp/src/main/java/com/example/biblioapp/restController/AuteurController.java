package com.example.biblioapp.restController;

import com.example.biblioapp.Repository.AuteurRepo;
import com.example.biblioapp.model.Auteur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auteur")
public class AuteurController {

    @Autowired
    private AuteurRepo repo;

    @PostMapping
    public Auteur saveAuteur(@RequestBody Auteur auteur){
        return repo.save(auteur);
    }

    @GetMapping
  public List<Auteur> getAllAuteur(){
        return repo.findAll();
  }
}
