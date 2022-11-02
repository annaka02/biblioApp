package com.example.biblioapp.Repository;

import com.example.biblioapp.model.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface LivreRepo extends JpaRepository <Livre, Integer> {
}
