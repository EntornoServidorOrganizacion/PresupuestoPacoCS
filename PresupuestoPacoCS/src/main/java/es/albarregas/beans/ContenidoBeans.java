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
    private boolean daniosAcc;
    // ESTE ATRIBUTO ES DOUBLE
    private int cantidadAse; 
    // ESTE ATRIBUTO ES DOUBLE
    private int franquicia; 
    private double prima;
    
    

    public boolean isDaniosAcc() {
        return daniosAcc;
    }

    public void setDaniosAcc(boolean daniosAcc) {
        this.daniosAcc = daniosAcc;
    }

    public int getCantidadAse() {
        return cantidadAse;
    }

    public void setCantidadAse(int cantidadAse) {
        this.cantidadAse = cantidadAse;
    }

    public int getFranquicia() {
        return franquicia;
    }

    public void setFranquicia(int franquicia) {
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
