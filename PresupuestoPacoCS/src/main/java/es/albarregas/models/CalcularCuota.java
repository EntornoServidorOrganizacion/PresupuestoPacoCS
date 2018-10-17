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
    static EleccionBeans eleccion = new EleccionBeans();
    static ContenidoBeans contenido = new ContenidoBeans();
    static EdificioBeans edificio = new EdificioBeans();

 
    //cuotaBasica = el valor en el mercado * 0,005
    static double cuotaBasica;
    static double prima;
    
    public static double primaEdificio() {
        /*cuotaBasica = edificio.getValorMercado() * 0.005;
        if(edificio.getTipoVivienda().equals("piso")){
            cuotaBasica = cuotaBasica * 0.95;
        }else if(edificio.getTipoVivienda().equals("casa")){
            cuotaBasica = cuotaBasica * 1;
        }else if(edificio.getTipoVivienda().equals("adosado")){
            cuotaBasica = cuotaBasica * 1.05;
        }else if(edificio.getTipoVivienda().equals("duplex")){
            cuotaBasica = cuotaBasica * 1.10;
        }else if(edificio.getTipoVivienda().equals("chalet")){
            cuotaBasica = cuotaBasica * 1.20;
        }
        
        prima = cuotaBasica;
        
        prima += prima / 100 * edificio.getNumHabitaciones();
        
        if(edificio.getAnioCons() == 1949){
            prima += prima * 0.09;
        }else if(edificio.getAnioCons() == 1951){
            prima += prima * 0.06;
        }else if(edificio.getAnioCons() == 1991){
            prima += prima * 0.04;
        }else if(edificio.getAnioCons() == 2006){
            prima += prima * 0.02;
        }else if(edificio.getAnioCons() == 2016){
            prima += prima * 0.01;
        }
        
        if(edificio.getTipoCons().equals("madera")){
            prima += prima * 0.1;
        }*/
        prima = 1000;
        return prima;
    }
    
    public static double primaContenido() {
        /*cuotaBasica = contenido.getCantidadAse() * 0.008;
        if(contenido.getDaniosAcc() != null){
            prima = prima * 1.25;
        }
        
        if(contenido.getFranquicia().equals("500")){
            prima -= prima * 0.1;
        }else if(contenido.getFranquicia().equals("1.000")){
            prima -= prima * 0.2;
        }*/
        prima = 200;
        return prima;
    }
    
    
}
