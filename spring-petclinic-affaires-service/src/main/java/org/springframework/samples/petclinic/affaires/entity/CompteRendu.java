package org.springframework.samples.petclinic.affaires.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author diouf
 */
@AllArgsConstructor
@NoArgsConstructor @Data @ToString
public class CompteRendu {
    private Long id;
    private String name;
}
