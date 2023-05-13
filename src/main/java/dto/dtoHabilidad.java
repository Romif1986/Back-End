
package dto;

import jakarta.validation.constraints.NotBlank;


public class dtoHabilidad{
    @NotBlank
    private String nombre;
    
    private String descripcion;
    
    private int porcentaje;

    public dtoHabilidad() {
        
        
    }

    public dtoHabilidad(String nombre, String descripcion, int porcentaje) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.porcentaje = porcentaje;
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

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    }
    
    
    
    //Constructores
