package org.springframework.samples.petclinic.lots.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;


@Table(name = "tranche")
@Entity
@AllArgsConstructor
@NoArgsConstructor @Data @ToString
public class Tranche implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private double avancementchantier;
    private double avancementPrepchantier;

    private Date dateDeDemarrageChantier;
    private Date dateDeDemarragePrepChantier;

    private Integer dureeChantier;
    private Integer dureePrepChantier;

    private String status;

    @ManyToOne
    private Lot lot;

    @ManyToOne
    private TypeDeTranche typeDeTranche;

    @OneToMany(mappedBy = "tranche")
    private Collection<Tache> taches;


    @OneToMany(mappedBy = "tranche")
    private Collection<Phase> phases;
}
