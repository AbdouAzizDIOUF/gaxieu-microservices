package org.springframework.samples.petclinic.affaires.controller;


import org.springframework.samples.petclinic.affaires.entity.Affaire;
import org.springframework.samples.petclinic.affaires.service.AffaireService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/affaires")
public class AffaireController {


    private final AffaireService affaireService;

    public AffaireController(AffaireService affaireService) {
        this.affaireService = affaireService;
    }



    @GetMapping(path = "/", produces="application/json")
    public Collection<Affaire> getAllAffaires(){

        return this.affaireService.getAllAffaires();
    }



    @GetMapping(path = "/{idUser}", produces="application/json")
    public Affaire getAllAffaire(@PathVariable("idUser") Long id){

        return this.affaireService.getAffaireById(id);
    }

}
