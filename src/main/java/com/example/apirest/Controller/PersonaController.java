package com.example.apirest.Controller;

import com.example.apirest.Models.Persona;
import com.example.apirest.Services.PersonaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class PersonaController {

    private final PersonaService personaService;

    @PostMapping("/api/personas")
    public Persona createPersona (@RequestBody Persona persona){
        return personaService.createPersona(persona);
    }

    @GetMapping("/api/personas/{id}")
    public Optional<Persona> getPersonaByID (@PathVariable  Long id ){
        return personaService.getPersonaByID(id);
    }

    @GetMapping("/api/personas")
    public List<Persona> getAllPersonas (){
        return personaService.getAllPersonas();
    }

    @PutMapping("/api/personas")
    public Persona updatePersona (@RequestBody Persona persona){
        return personaService.updatePersona(persona);
    }

    @DeleteMapping("/api/personas/{id}")
    public void deletePersona (@PathVariable Long id){
        personaService.deletePersona(id);
    }

    @DeleteMapping("/api/personas")
    public void deleteAllPersonas(){
        personaService.deleteAll();
    }
}
