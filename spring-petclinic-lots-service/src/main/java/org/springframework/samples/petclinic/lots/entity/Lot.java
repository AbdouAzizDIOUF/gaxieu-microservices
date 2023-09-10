package org.springframework.samples.petclinic.lots.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Collection;


@Table(name = "lots")
@Entity
@AllArgsConstructor
@NoArgsConstructor @Data @ToString
public class Lot implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String adjudiciare;

    private Long affaireID;

    @Transient
    private Affaire affaire;

    @OneToMany(mappedBy = "lot")
    private Collection<Tranche> tranches;
}
