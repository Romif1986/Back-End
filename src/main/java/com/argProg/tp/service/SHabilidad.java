/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argProg.tp.service;

import com.argProg.tp.entity.Habilidad;
import com.argProg.tp.repository.RHabilidad;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class SHabilidad{
     @Autowired
     RHabilidad rHabilidad;
     
     public List<Habilidad> list(){
         return rHabilidad.findAll();
     }
     
     public Optional<Habilidad> getOne(int id){
         return rHabilidad.findById(id);
     }
     
     public Optional<Habilidad> getByNombre(String nombre){
         return rHabilidad.findByNombre(nombre);
     }
     
     public void save(Habilidad hab){
         rHabilidad.save(hab);
     }
     
     public void delete(int id){
         rHabilidad.deleteById(id);
     }
     
     public boolean existsById(int id){
         return rHabilidad.existsById(id);
     }
     
     public boolean existsByNombre(String nombre){
         return rHabilidad.existsByNombre(nombre);
     }
}