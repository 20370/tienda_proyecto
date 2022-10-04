
package clases;

public class Bus extends Transporte{

      private String velomax;
    private String krecorrido;
   
    public static Bus bu[]=new Bus[20];
    
    public Bus(String placa, String cappasajeros, String captanque, String marca, String costodia
    ,String velomax,String krecorrido) {
        super(placa, cappasajeros, captanque, marca, costodia);
        
        this.velomax=velomax;
        this.krecorrido=krecorrido;
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
     * @return the krecorrido
     */
    public String getKrecorrido() {
        return krecorrido;
    }

    /**
     * @param krecorrido the krecorrido to set
     */
    public void setKrecorrido(String krecorrido) {
        this.krecorrido = krecorrido;
    }

    /**
     * @return the bu
     */
   

    /**
     * @param aBu the bu to set
     */
  
  
    
  
    
}
