/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import Ventana_logycreacioncuenta.Crear_Estacion_Bus;
import javax.swing.JOptionPane;

public class Estacion_bus {
  
    private String nombreins;
    private int fila;
    private int columna;
    int filan;
    int columnan;
    private String vb[][];

    public Estacion_bus(String nombreins,int fila,int columna,String vb[][]){
        
        this.nombreins=nombreins;
        this.fila=fila;
        this.columna=columna;
        this.vb=vb;
        
    }
    /**
     * @return the nombreins
     */
    public String getNombreins() {
        return nombreins;
    }

    /**
     * @param nombreins the nombreins to set
     */
    public void setNombreins(String nombreins) {
        this.nombreins = nombreins;
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
     * @return the vb
     */
    public String[][] getVb() {
   
        for (int i = 0; i < getFila(); i++) {
            for (int j = 0; j < getColumna(); j++) {
                vb[i][j]="vacio";
                System.out.print(" "+vb[i][j]+" ");
            }
            System.out.print("\n");
        }
        return vb;
    }

    /**
     * @param vb the vb to set
     */
    public void setVb(String[][] vb) {
        this.vb = vb;
    }
  public  void setmodVt(int filan,int columnan) {
    System.out.println("paso por modificacion -------------------------");
    this.filan=filan;
    this.columnan=columnan;
   
    
      if (vb[filan][columnan].equals("vacio")) {
            JOptionPane.showMessageDialog(null, "puede estacionar el carro en esta posicion ");
            vb[filan][columnan]=(String) Crear_Estacion_Bus.jComboBox1.getSelectedItem();
        }else{
        JOptionPane.showMessageDialog(null, "No puede escoger esta posion del hangar escoja otra ");
    }
    
    }
     
 public String[][] getmodVt() {
        System.out.println("paso por getvt _________________________");
           for (int i = 0; i < getFila(); i++) {
            for (int j = 0; j < getColumna(); j++) {
            
                System.out.print(" "+vb[i][j]+" ");
            }
            System.out.print("\n");
        }
        
     
      
        return vb;
    }
    
}
