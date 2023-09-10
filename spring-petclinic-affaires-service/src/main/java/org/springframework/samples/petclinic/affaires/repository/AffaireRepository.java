package org.springframework.samples.petclinic.affaires.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.samples.petclinic.affaires.entity.Affaire;


/**
 * @author diouf
 */
@RepositoryRestResource
public interface AffaireRepository extends JpaRepository<Affaire, Long> {
}
