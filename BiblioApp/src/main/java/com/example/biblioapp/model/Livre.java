package com.example.biblioapp.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idLivre")
    private Integer id;
    private String titre;
    private LocalDate dateDePublication;
    private Long nbDePages;

    @OneToOne
    @JoinColumn(name = "idAuteur")
    private Auteur auteur;
    @OneToOne
    @JoinColumn(name = "idGenre")
    private Genre genreLitteraire;


    public Genre getGenreLitteraire() {
        return genreLitteraire;
    }

    public void setGenreLitteraire(Genre genreLitteraire) {
        this.genreLitteraire = genreLitteraire;
    }


    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public LocalDate getDateDePublication() {
        return dateDePublication;
    }

    public void setDateDePublication(LocalDate dateDePublication) {
        this.dateDePublication = dateDePublication;
    }

    public Long getNbDePages() {
        return nbDePages;
    }

    public void setNbDePages(Long nbDePages) {
        this.nbDePages = nbDePages;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", dateDePublication=" + dateDePublication +
                ", nbDePages=" + nbDePages +
                '}';
    }

    public Livre() {
    }

    public Livre(int id, String titre, LocalDate dateDePublication, Long nbDePages, Auteur auteur, Genre genreLitteraire) {
        this.id = id;
        this.titre = titre;
        this.dateDePublication = dateDePublication;
        this.nbDePages = nbDePages;
        this.auteur = auteur;
        this.genreLitteraire = genreLitteraire;
    }
}
