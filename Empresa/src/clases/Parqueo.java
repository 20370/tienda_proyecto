/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import Ventana_logycreacioncuenta.Crear_parqueo;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Parqueo {
    
    private String nomins;
    private int fila;
    private int columna;
    private int fin;
    private int coln;
    private String vp[][];
    public static Parqueo pa[]=new Parqueo[40];

    /**
     * @return the nomins
     */
    public Parqueo(String nomins,int fila,int columna,String vp[][]){
        this.nomins=nomins;
        this.fila=fila;
        this.columna=columna;
        this.vp=vp;
    }
    public String getNomins() {
        return nomins;
    }

    /**
     * @param nomins the nomins to set
     */
    public void setNomins(String nomins) {
        this.nomins = nomins;
    }

    /**
     * @return the fila
     */
    public int getFila() {
        return fila;
    }

    /**
     * @param fila the fila to set
     */
    public void setFila(int fila) {
        this.fila = fila;
    }

    /**
     * @return the columna
     */
    public int getColumna() {
        return columna;
    }

    /**
     * @param columna the columna to set
     */
    public void setColumna(int columna) {
        this.columna = columna;
    }

    /**
     * @return the vt
     */
    public String[][] getVt() {
          for (int i = 0; i < getFila(); i++) {
            for (int j = 0; j < getColumna(); j++) {
                vp[i][j]="vacio";
                System.out.print(" "+vp[i][j]+" ");
            }
            System.out.print("\n");
        }
        
        return vp;
    }

    /**
     * @param vt the vt to set
     */
    public void setVt(String[][] vt) {
        this.vp = vp;
    }
     public  void setmodVt(int fin,int coln) {
    System.out.println("paso por modificacion -------------------------");
    this.fin=fin;
    this.coln=coln;
   
    
      if (vp[fin][coln].equals("vacio")) {
            JOptionPane.showMessageDialog(null, "puede estacionar el carro en esta posicion ");
            vp[fin][coln]=(String) Crear_parqueo.jComboBox1.getSelectedItem();
        }else{
        JOptionPane.showMessageDialog(null, "No puede escoger esta posion del hangar escoja otra ");
    }
    
    }
     
 public String[][] getmodVt() {
        System.out.println("paso por getvt _________________________");
           for (int i = 0; i < getFila(); i++) {
            for (int j = 0; j < getColumna(); j++) {
            
                System.out.print(" "+vp[i][j]+" ");
            }
            System.out.print("\n");
        }
        
     
      
        return vp;
    }
    
}
