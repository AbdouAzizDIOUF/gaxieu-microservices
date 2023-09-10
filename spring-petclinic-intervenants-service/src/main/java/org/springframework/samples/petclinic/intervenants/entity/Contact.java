package org.springframework.samples.petclinic.intervenants.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor @Data @ToString
public class Contact {

    private Long id;
    private String name;
    private String prenom;
    private String username;
    private String email;
    private String telephone;
    private String faxe;
    private Date createdAt = new Date();

}
