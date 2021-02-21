package com.petclinic.kdmclinic.repository;

import com.petclinic.kdmclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
