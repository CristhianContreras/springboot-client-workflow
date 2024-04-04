package com.cristhian.springboot.springbootclientworkflow.controllers.client;

import org.springframework.web.bind.annotation.RestController;

import com.cristhian.springboot.springbootclientworkflow.models.PersonaModel;
import com.cristhian.springboot.springbootclientworkflow.services.PersonaService;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(path = "/v1/personas")
public class ClientController {

    @Autowired
    PersonaService personaService;

    @GetMapping(path = "/consultarRegistros")
    public ArrayList<PersonaModel> getData() {
        return personaService.getData();
    }

    @PostMapping(path = "/crearRegistro")
    public PersonaModel createPersona(@RequestBody PersonaModel request) {
        return personaService.createRegistry(request);
    }
}
