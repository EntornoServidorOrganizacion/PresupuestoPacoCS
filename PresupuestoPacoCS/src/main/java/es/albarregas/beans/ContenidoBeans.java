/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.beans;

import java.io.Serializable;

/**
 *
 * @author paco
 */
public class ContenidoBeans implements Serializable{
    private boolean daniosAcc;
    private double cantidadAse;
    private double franquicia; 
    private double prima;

    /**
     * @return the daniosAcc
     */
    public boolean isDaniosAcc() {
        return daniosAcc;
    }

    /**
     * @param daniosAcc the daniosAcc to set
     */
    public void setDaniosAcc(boolean daniosAcc) {
        this.daniosAcc = daniosAcc;
    }

    /**
     * @return the cantidadAse
     */
    public double getCantidadAse() {
        return cantidadAse;
    }

    /**
     * @param cantidadAse the cantidadAse to set
     */
    public void setCantidadAse(double cantidadAse) {
        this.cantidadAse = cantidadAse;
    }

    /**
     * @return the franquicia
     */
    public double getFranquicia() {
        return franquicia;
    }

    /**
     * @param franquicia the franquicia to set
     */
    public void setFranquicia(double franquicia) {
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
        this.prima = prima;
    }
    
    
}
