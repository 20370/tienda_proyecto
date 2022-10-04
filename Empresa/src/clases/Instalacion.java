/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author user
 */
public class Instalacion {
    
    private String id;
    private String localidad;
    

    public static Instalacion ins[]=new Instalacion[30];
    
    public Instalacion(String id,String localidad){
        
        this.id=id;
        this.localidad=localidad;
       
        
    }
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the localidad
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * @param localidad the localidad to set
     */
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    /**
     * @return the nombreins
     */
   
}
