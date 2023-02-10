/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkcorp.prometeus.clasesGenerales;

/**
 *
 * @author links
 */
public abstract class Vehiculos {
    
    
    
    private String nombre;
    
    private int anio;
    
    private String pais;
    
    private String caracteristicas;

    public Vehiculos(String nombre, int anio, String pais, String caracteristicas){
    
        this.nombre = nombre;
        
        this.anio = anio;
        
        this.pais = pais;
        
        this.caracteristicas = caracteristicas;
        
        
    };
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
    
    
           
    
}
