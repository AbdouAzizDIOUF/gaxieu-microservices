package org.springframework.samples.petclinic.affaires.service;


import org.springframework.samples.petclinic.affaires.entity.Affaire;
import org.springframework.samples.petclinic.affaires.repository.AffaireRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
public class AffaireService {


    private final AffaireRepository affaireRepository;

    public AffaireService(AffaireRepository affaireRepository) {
        this.affaireRepository = affaireRepository;
    }


    /**
     * Liste toutes les affaires
     *
     * @return Collection<Affaire>
     */
    public Collection<Affaire> getAllAffaires() {
        return this.affaireRepository.findAll();
    }


    /**
     * Affiche une affaire par son id
     *
     * @param id
     * @return Affaire
     */
    public Affaire getAffaireById(Long id){

        return this.affaireRepository.findById(id).get();
    }
}

