/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examened;

/**
 * Interface de la clase Cafetera
 * @author Eduardo
 * @version 1.0
 */
public interface InterfaceCafetera {

    void agregarCafe(int cantidad) throws Exception;

    int getCapacidadMaxima();

    void llenarCafetera();

    void servirTaza(int tamanoTaza) throws Exception;

    void setCapacidadMaxima(int capacidadMaxima);

    void vaciarCafetera();
    
}
