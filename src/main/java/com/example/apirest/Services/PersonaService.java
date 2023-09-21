package com.example.apirest.Services;

import com.example.apirest.Models.Persona;
import com.example.apirest.Repository.PersonaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonaService {

    private final PersonaRepository personaRepo;

    public Persona createPersona (Persona persona){

        return personaRepo.save(persona);
    }

    public Persona updatePersona (Persona persona){
        return personaRepo.save(persona);
    }

    public Optional<Persona> getPersonaByID (Long id){
        return personaRepo.findById(id);
    }

    public List<Persona> getAllPersonas (){
        return personaRepo.findAll();
    }

    public void deletePersona (Long id){
        personaRepo.deleteById(id);
    }

    public void deleteAll (){
        personaRepo.deleteAll();
    }
}
