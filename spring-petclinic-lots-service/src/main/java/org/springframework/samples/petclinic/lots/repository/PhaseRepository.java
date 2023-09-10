package org.springframework.samples.petclinic.lots.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.samples.petclinic.lots.entity.Phase;


@RepositoryRestResource
public interface PhaseRepository extends JpaRepository<Phase, Long> {
}
