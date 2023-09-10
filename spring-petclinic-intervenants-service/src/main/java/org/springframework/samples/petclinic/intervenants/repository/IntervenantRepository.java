package org.springframework.samples.petclinic.intervenants.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.samples.petclinic.intervenants.entity.Intervenant;


/**
 * @author diouf
 */
@RepositoryRestResource
public interface IntervenantRepository extends JpaRepository<Intervenant, Long> {
}
