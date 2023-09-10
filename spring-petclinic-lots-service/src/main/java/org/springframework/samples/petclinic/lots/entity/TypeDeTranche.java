package org.springframework.samples.petclinic.lots.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;


/**
 * @author diouf
 */
@Table(name = "typeDeTranche")
@Entity
@AllArgsConstructor
@NoArgsConstructor @Data @ToString
public class TypeDeTranche implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;

    private Date deateDeCreation= new Date();

}
