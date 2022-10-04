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
public class Reservacion {

    /**
     * @return the tipoav
     */
    
   private String id;
   private String inicio;
   private String fin;
   private String nombclient;
   private String tipotrans;
   private String trans;
   private String piloto;
   private String numpersonas;
   private String monto;
private String cancelar;
private String mes;
private String loca;
private String cloc;
    /**
     * @return the id
     */
  public static Reservacion re[]=new Reservacion[20];
   public Reservacion(String id, String inicio,String fin, String nombclient,String tipotrans,String trans,String piloto,String numpersonas,String monto,String cancelar, String mes,String loca,String cloc){
       this.id=id;
       this.inicio=inicio;
       this.fin=fin;
       this.nombclient=nombclient;
       this.tipotrans=tipotrans;
       this.trans=trans;
       this.piloto=piloto;
       this.numpersonas=numpersonas;
       this.monto=monto;
       this.cancelar=cancelar;
       this.mes=mes;
       this.loca=loca;
       this.cloc=cloc;
   }
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the inicio
     */
    public String getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    /**
     * @return the fin
     */
    public String getFin() {
        return fin;
    }

    /**
     * @param fin the fin to set
     */
    public void setFin(String fin) {
        this.fin = fin;
    }

    /**
     * @return the nombclient
     */
    public String getNombclient() {
        return nombclient;
    }

    /**
     * @param nombclient the nombclient to set
     */
    public void setNombclient(String nombclient) {
        this.nombclient = nombclient;
    }

    /**
     * @return the tipotrans
     */
    public String getTipotrans() {
        return tipotrans;
    }

    /**
     * @param tipotrans the tipotrans to set
     */
    public void setTipotrans(String tipotrans) {
        this.tipotrans = tipotrans;
    }

    /**
     * @return the trans
     */
    public String getTrans() {
        return trans;
    }

    /**
     * @param trans the trans to set
     */
    public void setTrans(String trans) {
        this.trans = trans;
    }

    /**
     * @return the piloto
     */
    public String getPiloto() {
        return piloto;
    }

    /**
     * @param piloto the piloto to set
     */
    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    /**
     * @return the numpersonas
     */
    public String getNumpersonas() {
        return numpersonas;
    }

    /**
     * @param numpersonas the numpersonas to set
     */
    public void setNumpersonas(String numpersonas) {
        this.numpersonas = numpersonas;
    }

    /**
     * @return the monto
     */
    public String getMonto() {
        return monto;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(String monto) {
        this.monto = monto;
    }

    /**
     * @return the cancelar
     */
    public String getCancelar() {
        return cancelar;
    }

    /**
     * @param cancelar the cancelar to set
     */
    public void setCancelar(String cancelar) {
        this.cancelar = cancelar;
    }

    /**
     * @return the mes
     */
    public String getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(String mes) {
        this.mes = mes;
    }

    /**
     * @return the localidad
     */
    public String getLocalidad() {
        return loca;
    }

    /**
     * @param localidad the localidad to set
     */
    public void setLocalidad(String loca) {
        this.loca= loca;
    }

    /**
     * @return the cloc
     */
    public String getCloc() {
        return cloc;
    }

    /**
     * @param cloc the cloc to set
     */
    public void setCloc(String cloc) {
        this.cloc = cloc;
    }
   
  
   
}
