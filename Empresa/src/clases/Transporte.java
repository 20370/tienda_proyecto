package clases;



public class Transporte {
    
    private String placa;
    private String  cappasajeros;
    private String captanque;
    private String marca;
    private String  costopdia;


   public Transporte(String placa,String cappasajeros ,String captanque,String marca,String costodia){
      this.placa=placa;
      this.cappasajeros=cappasajeros;
      this.captanque=captanque;
      this.marca=marca;
      this.costopdia=costodia;
     
   }
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the cappasajeros
     */
    public String getCappasajeros() {
        return cappasajeros;
    }

    /**
     * @param cappasajeros the cappasajeros to set
     */
    public void setCappasajeros(String cappasajeros) {
        this.cappasajeros = cappasajeros;
    }

    /**
     * @return the captanque
     */
    public String getCaptanque() {
        return captanque;
    }

    /**
     * @param captanque the captanque to set
     */
    public void setCaptanque(String captanque) {
        this.captanque = captanque;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the costopdia
     */
    public String getCostopdia() {
        return costopdia;
    }

    /**
     * @param costopdia the costopdia to set
     */
    public void setCostopdia(String costopdia) {
        this.costopdia = costopdia;
    }

    /**
     * @return the reservado
     */
   
    
}
