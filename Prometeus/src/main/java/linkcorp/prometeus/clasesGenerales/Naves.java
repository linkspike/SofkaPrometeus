/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkcorp.prometeus.clasesGenerales;

/**
 *
 * @author links
 */
public class Naves extends Vehiculos implements VehiculosInterface{

    
    
    private String tipoNave;

    public Naves(String tipoNave, String nombre, int anio, String pais, String caracteristicas) {
        super(nombre, anio, pais, caracteristicas);
        this.tipoNave = tipoNave;
    }

    
    
    

    public String getTipoNave() {
        return tipoNave;
    }

    public void setTipoNave(String tipoNave) {
        this.tipoNave = tipoNave;
    }
    
    
    //
    @Override
    public String retornarInfo() {
       
        return "EL nombre es: "+this.getNombre()+"EL año de la nave es: "+this.getAnio()+"El pais de la nave es: "+this.getPais();
        
    }

    @Override
    public String retornarCaracteristicas() {
        
        return this.getCaracteristicas();
    }
   
    
    
}
