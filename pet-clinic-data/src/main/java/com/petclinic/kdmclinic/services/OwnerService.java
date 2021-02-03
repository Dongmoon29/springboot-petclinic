package com.petclinic.kdmclinic.services;

import com.petclinic.kdmclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);

}
