package net.coronite.jcpetclinic.services;

import net.coronite.jcpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById (Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
