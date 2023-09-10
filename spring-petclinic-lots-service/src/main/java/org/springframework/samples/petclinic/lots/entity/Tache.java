package org.springframework.samples.petclinic.lots.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;


@Table(name = "tache")
@Entity
@AllArgsConstructor
@NoArgsConstructor @Data @ToString
public class Tache implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    @Lob
    private String description;

    private String status;

    @ManyToOne
    private Tranche tranche;
}
