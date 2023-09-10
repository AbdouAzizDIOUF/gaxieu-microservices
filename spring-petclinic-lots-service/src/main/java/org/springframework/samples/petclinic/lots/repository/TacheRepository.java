package org.springframework.samples.petclinic.lots.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.samples.petclinic.lots.entity.Tache;



@RepositoryRestResource
public interface TacheRepository extends JpaRepository<Tache, Long> {
}
