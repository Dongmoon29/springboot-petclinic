package com.petclinic.kdmclinic.services;

import com.petclinic.kdmclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
