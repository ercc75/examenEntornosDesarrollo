/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examed;

/**
 * Interface de la clase Cafetera
 * @author Eduardo
 * @version 1.0
 */
public interface InterfaceCafetera {

    void agregarCafe(int cantidad) throws Exception;

    /**
     * @return the cantidadActual
     */
    int getCantidadActual();

    int getCapacidadMaxima();

    void llenarCafetera();

    void servirTaza(int tamanoTaza) throws Exception;

    /**
     * @param cantidadActual the cantidadActual to set
     */
    void setCantidadActual(int cantidadActual);

    void setCapacidadMaxima(int capacidadMaxima);

    void vaciarCafetera();
    
}
