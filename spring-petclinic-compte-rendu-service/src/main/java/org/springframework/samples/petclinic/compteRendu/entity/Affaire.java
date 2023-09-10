package org.springframework.samples.petclinic.compteRendu.entity;


import lombok.*;

/**
 * @author diouf
 */
@AllArgsConstructor
@NoArgsConstructor @Data @ToString
public class Affaire {
    private Long id;
    private String name;
    private String status;
}
