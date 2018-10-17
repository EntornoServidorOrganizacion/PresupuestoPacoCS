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
public class EleccionBeans implements Serializable{
    private boolean edificio;
    private boolean contenido;

    /**
     * @return the edificio
     */
    public boolean isEdificio() {
        return edificio;
    }

    /**
     * @param edificio the edificio to set
     */
    public void setEdificio(boolean edificio) {
        this.edificio = edificio;
    }

    /**
     * @return the contenido
     */
    public boolean isContenido() {
        return contenido;
    }

    /**
     * @param contenido the contenido to set
     */
    public void setContenido(boolean contenido) {
        this.contenido = contenido;
    }
    
    
}
