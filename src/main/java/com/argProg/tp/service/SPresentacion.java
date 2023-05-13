/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argProg.tp.service;

import com.argProg.tp.entity.Presentacion;
import com.argProg.tp.repository.RPresentacion;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class SPresentacion {

    @Autowired
    RPresentacion rPresentacion;
    
    public List<Presentacion> list(){
         return rPresentacion.findAll();
     }
     
     public Optional<Presentacion> getOne(int id){
         return rPresentacion.findById(id);
     }
     
     public Optional<Presentacion> getByNombre(String descripcion){
         return rPresentacion.findByDescripcion(descripcion);
     }
     
     public void save(Presentacion descripcion){
         rPresentacion.save(descripcion);
     }
     
     public void delete(int id){
         rPresentacion.deleteById(id);
     }
     
     public boolean existsById(int id){
         return rPresentacion.existsById(id);
     }
     
     public boolean existsByPresentacion(String descripcion){
         return rPresentacion.existsByDescripcion(descripcion);
     }
}