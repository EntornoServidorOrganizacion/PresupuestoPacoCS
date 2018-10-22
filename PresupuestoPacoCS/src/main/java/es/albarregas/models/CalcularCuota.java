/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.models;

import es.albarregas.beans.ContenidoBeans;
import es.albarregas.beans.EdificioBeans;
import es.albarregas.beans.EleccionBeans;
import es.albarregas.controllers.Eleccion;

/**
 *
 * @author paco
 */
public class CalcularCuota {

    //CALCULO DE LA PRIMA DE EDIFICIO
    //retorna la prima (double)
    public static double primaEdificio(EdificioBeans edificio) {
        double cuotaBasica;
        double prima = 0;
        cuotaBasica = edificio.getValorMercado() * 0.005;

        // EXISTEN LAS SENTENCIAS switch QUE TE EVITAN TANTO IF
        if (edificio.getTipoVivienda().equals("piso")) {
            cuotaBasica = cuotaBasica * 0.95;
        } else if (edificio.getTipoVivienda().equals("casa")) {
            cuotaBasica = cuotaBasica * 1;
        } else if (edificio.getTipoVivienda().equals("adosado")) {
            cuotaBasica = cuotaBasica * 1.05;
        } else if (edificio.getTipoVivienda().equals("duplex")) {
            cuotaBasica = cuotaBasica * 1.10;
        } else if (edificio.getTipoVivienda().equals("chalet")) {
            cuotaBasica = cuotaBasica * 1.20;
        }

        prima = cuotaBasica;

        prima += prima / 100 * edificio.getNumHabitaciones();

        if (edificio.getAnioCons() == 1949) {
            prima += prima * 0.09;
        } else if (edificio.getAnioCons() == 1951) {
            prima += prima * 0.06;
        } else if (edificio.getAnioCons() == 1991) {
            prima += prima * 0.04;
        } else if (edificio.getAnioCons() == 2006) {
            prima += prima * 0.02;
        } else if (edificio.getAnioCons() == 2016) {
            prima += prima * 0.01;
        }

        if (edificio.getTipoCons().equals("madera")) {
            prima += prima * 0.1;
        }
        

        return prima;
    }

    //CALCULO DE LA PRIMA DEL CONTENIDO
    //retorna la prima (double)
    public static double primaContenido(ContenidoBeans contenido) {
        double cuotaBasica;
        double prima = contenido.getCantidadAse() * 0.008;

        if (contenido.isDaniosAcc()) {
            prima = prima * 1.25;
        }

        if (contenido.getFranquicia() == 500) {
            prima -= prima * 0.1;
        } else if (contenido.getFranquicia() == 1000) {
            prima -= prima * 0.2;
        }

        
        return prima;
    }

}
