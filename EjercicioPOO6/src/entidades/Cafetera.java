package entidades;

public class Cafetera {
    private int capacidadMaxima;
    private int capacidadActual;

    public Cafetera() {

    }

    public Cafetera(int capacidadActual, int capacidadMaxima) {
        this.capacidadActual = capacidadActual;
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void llenarCafetera() {
        capacidadActual = capacidadMaxima;
    }

    public void servirTaza(int tamTaza) {
        int capacidadSinServir = tamTaza - capacidadActual;
        if (capacidadSinServir <= 0 ) {
            System.out.println("Se lleno la taza");
            capacidadActual = 0;
        } else {
            System.out.println("La taza falta llenar una capacidad de: " + capacidadSinServir );
            capacidadActual = capacidadActual - tamTaza;
        }
    }

    public void vaciarCafetera() {
        capacidadActual = 0;
    }

    public void agregarCafe(int cantidad) {
        capacidadActual = capacidadActual + cantidad;
    }



}
