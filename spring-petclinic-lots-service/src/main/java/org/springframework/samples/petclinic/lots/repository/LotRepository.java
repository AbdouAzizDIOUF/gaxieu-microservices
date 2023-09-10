package org.springframework.samples.petclinic.lots.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.samples.petclinic.lots.entity.Lot;


@RepositoryRestResource
public interface LotRepository extends JpaRepository<Lot, Long> {
}
