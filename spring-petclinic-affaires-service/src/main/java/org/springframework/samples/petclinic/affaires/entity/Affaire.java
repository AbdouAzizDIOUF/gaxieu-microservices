package org.springframework.samples.petclinic.affaires.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Collection;


@Table(name = "affaires")
@Entity
@AllArgsConstructor
@NoArgsConstructor @Data @ToString
public class Affaire implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String numero;
    private String commune;
    private double avancement;
    @Lob
    private String description;
    private String status;


    @Transient
    private Collection<Lots> lots;
    @Transient
    private Collection<CompteRendu> compteRendus;
}
