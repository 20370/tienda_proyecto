package clases;


public class Usuario {
    
    private String nombreuser;
    private String contrasena;
    private String nombre;
    private String apellido;
    
    public static Usuario us[]=new Usuario[50];
  

    public Usuario(String nombreuser, String contrasena, String nombre, String apellido){
        this.nombreuser=nombreuser;
        this.contrasena=contrasena;
        this.nombre=nombre;
        this.apellido=apellido;
       
        
    }
   
    public String getNombreuser() {
       
        
        
        return nombreuser;
    }

    /**
     * @param nombreuser the nombreuser to set
     */
    public void setNombreuser(String nombreuser) {
        this.nombreuser = nombreuser;
    }

    /**
     * @return the contrasena
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * @param contrasena the contrasena to set
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
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

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String tarjetacredito) {
        this.apellido = apellido;
    }
   

}

