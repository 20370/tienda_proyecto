package clases;


public class Avion extends Transporte{

  
    public static Avion avi[]=new Avion[20];
    private String alturamax;
    
    public Avion(String placa, String cappasajeros, String captanque, String marca, String costodia,String alturamax) {
        super(placa, cappasajeros, captanque, marca, costodia);
    this.alturamax=alturamax;
    
    }
      /**
     * @return the alturamax
     */
    public String getAlturamax() {
        return alturamax;
    }

    /**
     * @param alturamax the alturamax to set
     */
    public void setAlturamax(String alturamax) {
        this.alturamax = alturamax;
    }
    
}
