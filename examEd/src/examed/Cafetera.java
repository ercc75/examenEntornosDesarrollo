
package examed;
/**
 * Clase publica Cafetera
 * @author Eduardo
 * @version 1.0
 */
public class Cafetera implements InterfaceCafetera {
    private int capacidadMaxima;
    private int cantidadActual;
    
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
        setCantidadActual(getCapacidadMaxima());
    }


    /**
     * Metodo servirTaza
     * @param tamanoTaza Introduce el tamaño de la taza
     * @throws Exception Indica que la cafetera no tiene cafe
     */
    @Override
    public void servirTaza(int tamanoTaza) throws Exception {
        setCantidadActual(getCantidadActual() - tamanoTaza);
		if (getCantidadActual() <0){
			setCantidadActual(0);
 			throw new Exception("No hay cafe");
		}
    }

    /**
     * Metodo vaciarCafetera
     */
    @Override
    public void vaciarCafetera() {
        setCantidadActual(0);
    }


    /**
     * Metodo agregarCafe
     * @param cantidad Introduce la cantidad de cafe
     * @throws Exception Indica que el café rebosa
     */
    @Override
    public void agregarCafe(int cantidad) throws Exception {
        setCantidadActual(getCantidadActual() + cantidad);
		if (getCantidadActual() > getCapacidadMaxima()){
			setCantidadActual(getCapacidadMaxima());
 			throw new Exception("Rebosa");
		}

    }

    /**
     * Metodo getCantidadActual
     * @return cantidadActual Devuelve la cantidad actual
     */
    @Override
    public int getCantidadActual() {
        return cantidadActual;
    }

    /**Metodo setCantidadActual
     * @param cantidadActual Introduce la cantidad actual
     */
    @Override
    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
}
