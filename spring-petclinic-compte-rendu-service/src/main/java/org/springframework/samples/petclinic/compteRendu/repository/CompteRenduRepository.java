package org.springframework.samples.petclinic.compteRendu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.samples.petclinic.compteRendu.entity.Affaire;
import org.springframework.samples.petclinic.compteRendu.entity.CompteRendu;


/**
 * @author diouf
 */
@RepositoryRestResource
public interface CompteRenduRepository extends JpaRepository<CompteRendu, Long> {
}
