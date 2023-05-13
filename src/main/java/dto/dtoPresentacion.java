/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import jakarta.validation.constraints.NotBlank;

/**
 *
 * @author Fraedusa
 */
public class dtoPresentacion {
     @NotBlank
    private String descripcion;
   
    //Constructores

    public dtoPresentacion() {
    }

    public dtoPresentacion(String descripcion) {
        this.descripcion = descripcion;
       
    }
    //Getters & Setters

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcionE(String descripcion) {
        this.descripcion = descripcion;
    }

    
}

