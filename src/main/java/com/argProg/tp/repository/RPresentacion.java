/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argProg.tp.repository;


import com.argProg.tp.entity.Presentacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RPresentacion extends JpaRepository <Presentacion, Integer> {
     public Optional<Presentacion> findByDescripcion(String descripcion);
    public boolean existsByDescripcion(String descripcion);
}
