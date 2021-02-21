package com.petclinic.kdmclinic.repository;

import com.petclinic.kdmclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
