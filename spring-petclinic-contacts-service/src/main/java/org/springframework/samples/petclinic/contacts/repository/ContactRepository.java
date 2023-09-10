package org.springframework.samples.petclinic.contacts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.samples.petclinic.contacts.entity.Contact;


/**
 * @author diouf
 */
@RepositoryRestResource
public interface ContactRepository extends JpaRepository<Contact, Long> {
}
