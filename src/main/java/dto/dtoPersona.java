/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;



public class dtoPersona {
  
    private String titulo;
   
    private String nombre;
 
    private String descripcion;
   

    public dtoPersona() {
    }

    public dtoPersona(String titulo, String nombre, String descripcion) {
        this.titulo = titulo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}
