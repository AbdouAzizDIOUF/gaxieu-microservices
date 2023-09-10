package org.springframework.samples.petclinic.contacts.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Table(name = "contacts")
@Entity
@NoArgsConstructor
@AllArgsConstructor @Data @ToString
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String prenom;
    private String username;
    private String email;
    private String telephone;
    private String faxe;
    private Date createdAt = new Date();

    private Long intervenantId;

}
