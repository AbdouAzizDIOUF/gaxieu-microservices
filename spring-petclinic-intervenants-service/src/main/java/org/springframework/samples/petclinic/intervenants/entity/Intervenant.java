package org.springframework.samples.petclinic.intervenants.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Collection;


@Table(name = "intervenants")
@Entity
@AllArgsConstructor
@NoArgsConstructor @Data @ToString
public class Intervenant implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nom;
    private String logo;

    private String email;
    private String telephone;
    private String adresse;
    private Integer codePostal;

    @Transient
    private Collection<Contact> contacts;
}
