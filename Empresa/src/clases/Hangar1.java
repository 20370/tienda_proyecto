/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import Ventana_logycreacioncuenta.Crear_hangar1;
import Ventana_logycreacioncuenta.Mover_los_autosOpe;
import Ventana_logycreacioncuenta.Parqueo_Aviones;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Hangar1 {
    
    private String nombins;
    private int fila;
    private int columna;
    private String vt[][];
    private int fin;
    private int coln;
   
    
    public static Hangar1 h1[]=new Hangar1[50];
    

    /**
     * @return the fila
     */
    public Hangar1(String nombins,int fila,int columna,String vt[][]){
        this.nombins=nombins;
        this.fila=fila;
        this.columna=columna;
        this.vt=vt;
       
    }
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
        System.out.println("paso por getvt _________________________");     
        System.out.println("velor de fila "+getFila()+" columna "+getColumna());
        
           for (int i = 0; i < getFila(); i++) {
            for (int j = 0; j < getColumna(); j++) {
             vt[i][j]="vacio";
                System.out.print(" "+vt[i][j]+" ");
            }
            System.out.print("\n");
        }
        
     
      
        return vt;
    }

    /**
     * @param vt the vt to set
     */
    public void setVt(String[][] vt) {
        this.vt = vt;
    }

    
    public  void setmodVt(int fin,int coln) {
  
    this.fin=fin;
    this.coln=coln;
    
      
        System.out.println("paso adentro de mod valor de fin "+fin+" valor de columna "+coln);
        
    if (vt[fin][coln].equals("vacio")) {
        System.out.println("paso por if");
            JOptionPane.showMessageDialog(null, "puede estacionar el carro en esta posicion ");
System.out.println("jcombo "+ Parqueo_Aviones.jComboBox1.getSelectedItem());
            vt[fin][coln]=(String) Parqueo_Aviones.jComboBox1.getSelectedItem();
        }else{
        JOptionPane.showMessageDialog(null, "No puede escoger esta posion del hangar escoja otra ");
    }
    }
//    
     public String[][] getmodVt() {
        System.out.println("paso por getmod_________________________");
        
        
        for (int i = 0; i < getFila(); i++) {
            for (int j = 0; j < getColumna(); j++) {
         
                System.out.print(" "+vt[i][j]+" ");
            }
            System.out.print("\n");
        }
        
     
      
        return vt;
    }

    /**
     * @return the nombins
     */
    public String getNombins() {
        return nombins;
    }

    /**
     * @param nombins the nombins to set
     */
    public void setNombins(String nombins) {
        this.nombins = nombins;
    }
 public String[][] getguaVt() {
     
        System.out.println("paso por getvisual_________________________");
        Object dato;
   
        Mover_los_autosOpe.modelopmoverav.setRowCount(getFila());
        
        Mover_los_autosOpe.modelopmoverav.setColumnCount(getColumna());
        
        for (int i = 0; i < getFila(); i++) {
            for (int j = 0; j < getColumna(); j++) {
                dato=vt[i][j];
                
                Mover_los_autosOpe.modelopmoverav.setValueAt(dato, i, j);
                
            }
            
        }
         return vt;
    }
    /**
     * @return the nombreh
     */
  
 public String[][] getmotransVt() {
     
        System.out.println("paso por getvisual_________________________");
      
       int f;
       int c;
       f=0;
       c=0;
       f=Mover_los_autosOpe.jTable1.getSelectedRow();
       c=Mover_los_autosOpe.jTable1.getColumnCount();
       
       Mover_los_autosOpe.modelopmoverav.setValueAt(vt[f][c], f, c);
       
         return vt;
    }
 
}