package clases;

import clases.Usuario;


public class Operador extends Usuario{
    public static Operador op[]=new Operador[20];
    
    public Operador(String nombreuser, String contrasena, String nombre, String apellido) {
        super(nombreuser, contrasena, nombre, apellido);
    }

}
