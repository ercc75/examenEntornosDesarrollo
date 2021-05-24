
package examened;

/**
 * Clase publica Cafetera
 * @author Eduardo
 * @version 1.0
 */
public class Cafetera implements InterfaceCafetera {
    /**
     * Capacidad maxima de la cafetera
     */
    public int capacidadMaxima;
    /**
     * Capacidad actual de la cafetera
     */
    public int cantidadActual;
    
    /**
     * Constructor Cafetera con 2 parametros
     * @param capacidadMaxima Para introducir la capacidad maxima
     * @param cantidadActual Para introducir la cantidad actual
     */
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.cantidadActual = cantidadActual;
        this.capacidadMaxima = Math.max(capacidadMaxima, cantidadActual);
    }

    /**
     * Constructor Cafetera con 1 parametro
     * @param capacidadMaxima Para introducir la capacidad maxima
     */
    public Cafetera(int capacidadMaxima) {
        this(capacidadMaxima, 0);
    }

    /**
     * Constructor Cafetera sin parametros
     */
    public Cafetera() {
        this(1000, 0);
    }

    /**
     * Metodo getCapacidadMaxima
     * @return Devuelve la maxima capacidad de la cafetera
     */
    @Override
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    /**
     * Metodo setCapacidadMaxima
     * @param capacidadMaxima Introduce la maxima capacidad de la cafetera
     */
    @Override
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    /**
     * Metodo llenarCafetera
     */
    @Override
    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;
    }

    /**
     * Metodo servirTaza
     * @param tamanoTaza Introduce el tamaño de la taza
     * @throws Exception Indica que la cafetera no tiene cafe
     */
    @Override
    public void servirTaza(int tamanoTaza) throws Exception {
        cantidadActual -= tamanoTaza;
		if (cantidadActual <0){
			cantidadActual=0;
 			throw new Exception("No hay café");
		}
    }

    /**
     * Metodo vaciarCafetera
     */
    @Override
    public void vaciarCafetera() {
        cantidadActual = 0;
    }

    /**
     * Metodo agregarCafe
     * @param cantidad Introduce la cantidad de cafe
     * @throws Exception Indica que el café rebosa
     */
    @Override
    public void agregarCafe(int cantidad) throws Exception {
        cantidadActual =cantidadActual + cantidad;
		if (cantidadActual > capacidadMaxima){
			cantidadActual=capacidadMaxima;
 			throw new Exception("Rebosa");
		}
    }
}
