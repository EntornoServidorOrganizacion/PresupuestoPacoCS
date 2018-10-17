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
public class EdificioBeans implements Serializable{
    private double prima;
    private String tipoVivienda;
    private int numHabitaciones;
    private int anioCons;
    private String tipoCons;
    private int valorMercado;

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
        this.prima = CalcularCuota.primaEdificio();
    }

    /**
     * @return the tipoVivienda
     */
    public String getTipoVivienda() {
        return tipoVivienda;
    }

    /**
     * @param tipoVivienda the tipoVivienda to set
     */
    public void setTipoVivienda(String tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }

    /**
     * @return the numHabitaciones
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * @param numHabitaciones the numHabitaciones to set
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * @return the anioCons
     */
    public int getAnioCons() {
        return anioCons;
    }

    /**
     * @param anioCons the anioCons to set
     */
    public void setAnioCons(int anioCons) {
        this.anioCons = anioCons;
    }

    /**
     * @return the tipoCons
     */
    public String getTipoCons() {
        return tipoCons;
    }

    /**
     * @param tipoCons the tipoCons to set
     */
    public void setTipoCons(String tipoCons) {
        this.tipoCons = tipoCons;
    }

    /**
     * @return the valorMercado
     */
    public int getValorMercado() {
        return valorMercado;
    }

    /**
     * @param valorMercado the valorMercado to set
     */
    public void setValorMercado(int valorMercado) {
        this.valorMercado = valorMercado;
    }
    
    
}
