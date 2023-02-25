package com.melnikprod.javatrainer.models;

import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
// Just some spring wizardry. I don't know how you specify like specific tables or whatever

public interface TrainerRepository extends CrudRepository<Trainer, Integer> {

}