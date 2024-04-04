package com.cristhian.springboot.springbootclientworkflow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cristhian.springboot.springbootclientworkflow.models.PersonaModel;

@Repository
public interface PersonaRepository extends CrudRepository<PersonaModel, Long> {

}
