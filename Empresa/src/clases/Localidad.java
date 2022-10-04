
package clases;


public class Localidad extends Pais{
    public static Localidad lo[]=new Localidad[30];

    /**
     * @return the clocalidad
     */
  
    
    
    public Localidad(String codigo, String nombre,String clocalidad) {
        super(codigo, nombre);
        this.clocalidad=clocalidad;
    }
      public String getClocalidad() {
        return clocalidad;
    }

    /**
     * @param clocalidad the clocalidad to set
     */
    public void setClocalidad(String clocalidad) {
        this.clocalidad = clocalidad;
    }
    
    private String clocalidad;
    
}
