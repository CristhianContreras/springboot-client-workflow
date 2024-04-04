package com.cristhian.springboot.springbootclientworkflow.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristhian.springboot.springbootclientworkflow.models.PersonaModel;
import com.cristhian.springboot.springbootclientworkflow.repositories.PersonaRepository;

@Service
public class PersonaService {

    @Autowired
    PersonaRepository personaRepository;

    public ArrayList<PersonaModel> getData() {
        return (ArrayList<PersonaModel>) personaRepository.findAll();
    }

    public PersonaModel createRegistry(PersonaModel persona) {
        return personaRepository.save(persona);
    }
}
