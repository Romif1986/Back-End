/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argProg.tp.service;

import com.argProg.tp.entity.Persona;
import com.argProg.tp.repository.RPersona;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SPersona {

    @Autowired
    RPersona rPersona;
    
    public List<Persona> list(){
         return rPersona.findAll();
     }
     
     public Optional<Persona> getOne(int id){
         return rPersona.findById(id);
     }
     
     public Optional<Persona> getByNombre(String nombreE){
         return rPersona.findByNombre(nombreE);
     }
     
     public void save(Persona persona){
         rPersona.save(persona);
     }
     
     public void delete(int id){
         rPersona.deleteById(id);
     }
     
     public boolean existsById(int id){
         return rPersona.existsById(id);
     }
     
     public boolean existsByNombre(String nombreE){
         return rPersona.existsByNombre(nombreE);
     }
}