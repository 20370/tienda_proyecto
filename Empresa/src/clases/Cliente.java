
package clases;

import Ventana_logycreacioncuenta.Loguser;
import clases.Usuario;
import javax.swing.JOptionPane;


public class Cliente extends Usuario{

  public static Cliente cli[]=new Cliente[10];
   public static boolean v=true;
    
    private String tarjcredito;
    private String contranueva;
    
    public Cliente(String nombreuser, String contrasena, String nombre, String apellido,String tarjcredito,String contranueva) {
        super(nombreuser, contrasena, nombre, apellido);
        
        this.tarjcredito=tarjcredito;
        this.contranueva=contranueva;
    }
      public String getTarjcredito() {
        return tarjcredito;
        
    }

    /**
     * @param tarjcredito the tarjcredito to set
     */
    public void setTarjcredito(String tarjcredito) {
        this.tarjcredito = tarjcredito;
    }
     public String getContranueva() {
        return contranueva;
        
    }

    /**
     * @param tarjcredito the tarjcredito to set
     */
    public void setContranueva(String contranueva) {
        this.contranueva = contranueva;
    }
    public void validauser(){
      String anterior="";
      
     
        
    }
   
}
