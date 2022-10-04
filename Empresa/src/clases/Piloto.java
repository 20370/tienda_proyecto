
package clases;


public class Piloto extends Usuario{
    
            private String tipodpiloto;
             private String idlic;
  
          public static Piloto pi[]=new Piloto[20];
    
    public Piloto(String nombreuser, String contrasena, String nombre, String apellido,String tipodpiloto,String idlic) {
        super(nombreuser, contrasena, nombre, apellido);
        
        this.tipodpiloto=tipodpiloto;
        this.idlic=idlic;
        
    }
   
    /**
     * @return the tipodpiloto
     */
    public String getTipodpiloto() {
        return tipodpiloto;
    }

    /**
     * @param tipodpiloto the tipodpiloto to set
     */
    public void setTipodpiloto(String tipodpiloto) {
        this.tipodpiloto = tipodpiloto;
    }

    /**
     * @return the idlic
     */
    public String getIdlic() {
        return idlic;
    }

    /**
     * @param idlic the idlic to set
     */
    public void setIdlic(String idlic) {
        this.idlic = idlic;
    }
 
    
    
}
