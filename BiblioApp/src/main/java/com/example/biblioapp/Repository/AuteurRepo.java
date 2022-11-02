package com.example.biblioapp.Repository;

import com.example.biblioapp.model.Auteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuteurRepo extends JpaRepository<Auteur, Integer> {
}
