
package clases;


public class Pais {
    
      private String codigo;
    private String nombre;
    public static Pais pai[]=new Pais[30];
    
public Pais(String codigo,String nombre){
    
    this.codigo=codigo;
    this.nombre=nombre;
    
    
    
}
    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
 
}
