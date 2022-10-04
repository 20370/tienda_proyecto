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
public class Automovil extends Transporte{
 
    private String automatico;
    private String velomax;
    private String krecorridos;
    public static Automovil au[]=new Automovil[20];
    
    public Automovil(String placa, String cappasajeros, String captanque, String marca, String costodia,String automatico,String velomax,String krecorridos) {
        super(placa, cappasajeros, captanque, marca, costodia);
        
        this.automatico=automatico;
        this.velomax=velomax;
        this.krecorridos=krecorridos;
        
    }
    /**
     * @return the automatico
     */
    public String getAutomatico() {
        return automatico;
    }

    /**
     * @param automatico the automatico to set
     */
    public void setAutomatico(String automatico) {
        this.automatico = automatico;
    }

    /**
     * @return the velomax
     */
    public String getVelomax() {
        return velomax;
    }

    /**
     * @param velomax the velomax to set
     */
    public void setVelomax(String velomax) {
        this.velomax = velomax;
    }

    /**
     * @return the krecorridos
     */
    public String getKrecorridos() {
        return krecorridos;
    }

    /**
     * @param krecorridos the krecorridos to set
     */
    public void setKrecorridos(String krecorridos) {
        this.krecorridos = krecorridos;
    }
    
   
    
}
