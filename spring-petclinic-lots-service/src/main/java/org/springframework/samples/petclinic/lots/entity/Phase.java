package org.springframework.samples.petclinic.lots.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;


@Table(name = "phase")
@Entity
@AllArgsConstructor
@NoArgsConstructor @Data @ToString
public class Phase implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;

    @ManyToOne
    private Tranche tranche;

}
