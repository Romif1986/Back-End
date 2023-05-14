/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argProg.tp.controler;

import com.argProg.tp.entity.Presentacion;
import com.argProg.tp.security.controller.Mensaje;
import com.argProg.tp.service.SPresentacion;
import dto.dtoPresentacion;
import io.micrometer.common.util.StringUtils;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;







@RestController
@RequestMapping("presentacion")
@CrossOrigin(origins = "https://miportfoliorf.firebaseapp.com/")
public class CPresentacion {
  @Autowired
    SPresentacion sPresentacion;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Presentacion>> list(){
        List<Presentacion> list = sPresentacion.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Presentacion> getById(@PathVariable("id") int id){
        if(!sPresentacion.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Presentacion presentacion = sPresentacion.getOne(id).get();
        return new ResponseEntity(presentacion, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sPresentacion.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        sPresentacion.delete(id);
        return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
    }

    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoPresentacion dtopre){      
        if(StringUtils.isBlank(dtopre.getDescripcion()))
            return new ResponseEntity(new Mensaje("La descripcion es obligatorio"), HttpStatus.BAD_REQUEST);
        if(sPresentacion.existsByPresentacion(dtopre.getDescripcion()))
            return new ResponseEntity(new Mensaje("Esa descripcion existe"), HttpStatus.BAD_REQUEST);
        
        Presentacion presentacion = new Presentacion(dtopre.getDescripcion());
        sPresentacion.save(presentacion);
        
        return new ResponseEntity(new Mensaje("Descripcion agregada"), HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoPresentacion dtopre){
        //Validamos si existe el ID
        if(!sPresentacion.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
       
        //No puede estar vacio
        if(StringUtils.isBlank(dtopre.getDescripcion()))
            return new ResponseEntity(new Mensaje("La descripcion es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Presentacion presentacion = sPresentacion.getOne(id).get();
        presentacion.setDescripcion(dtopre.getDescripcion());
       
        
        sPresentacion.save(presentacion);
        return new ResponseEntity(new Mensaje("Descripcion actualizada"), HttpStatus.OK);
             
    }
}