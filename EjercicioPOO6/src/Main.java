import entidades.Cafetera;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cafetera cafetera = new Cafetera();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar la capacidad maxima de la cafetera: ");
        cafetera.setCapacidadMaxima(scanner.nextInt());

        System.out.println("Ingresar la capidad actual de la cafetera: ");
        cafetera.setCapacidadActual(scanner.nextInt());

        cafetera.llenarCafetera();
        System.out.println("La capacidad actual es: " + cafetera.getCapacidadActual());

        System.out.println("Ingresar el tamanio de la taza vacia que quiere llenar");
        cafetera.servirTaza(scanner.nextInt());

        cafetera.vaciarCafetera();
        System.out.println("La capacidad actual de la cafetera es: " + cafetera.getCapacidadActual());

        System.out.println("Ingresar la cantidad de cafe que quiere agregar: ");
        cafetera.agregarCafe(scanner.nextInt());

    }
}