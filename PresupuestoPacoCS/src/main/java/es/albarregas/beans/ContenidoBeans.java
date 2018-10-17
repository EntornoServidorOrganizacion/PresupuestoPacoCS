/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.beans;

import es.albarregas.models.CalcularCuota;
import java.io.Serializable;

/**
 *
 * @author paco
 */
public class ContenidoBeans implements Serializable{
    private String daniosAcc;
    private int cantidadAse;
    private String franquicia;
    private double prima;

    /**
     * @return the daniosAcc
     */
    public String getDaniosAcc() {
        return daniosAcc;
    }

    /**
     * @param daniosAcc the daniosAcc to set
     */
    public void setDaniosAcc(String daniosAcc) {
        this.daniosAcc = daniosAcc;
    }

    /**
     * @return the cantidadAse
     */
    public int getCantidadAse() {
        return cantidadAse;
    }

    /**
     * @param cantidadAse the cantidadAse to set
     */
    public void setCantidadAse(int cantidadAse) {
        this.cantidadAse = cantidadAse;
    }

    /**
     * @return the franquicia
     */
    public String getFranquicia() {
        return franquicia;
    }

    /**
     * @param franquicia the franquicia to set
     */
    public void setFranquicia(String franquicia) {
        this.franquicia = franquicia;
    }

    /**
     * @return the prima
     */
    public double getPrima() {
        return prima;
    }

    /**
     * @param prima the prima to set
     */
    public void setPrima(double prima) {
        this.prima = CalcularCuota.primaContenido();
    }

    
    
    
}
