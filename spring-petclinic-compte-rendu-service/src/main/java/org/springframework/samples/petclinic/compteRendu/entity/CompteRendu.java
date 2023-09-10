package org.springframework.samples.petclinic.compteRendu.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;


/**
 * @author diouf
 */
@Table(name = "compteRendu")
@Entity
@AllArgsConstructor
@NoArgsConstructor @Data @ToString
public class CompteRendu implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String numero;

    @Lob
    private String description;


    private Long affaireId;
    private Long affaireId2;
    private Long affaireId3;



    @Transient
    private Affaire affaire;
}
