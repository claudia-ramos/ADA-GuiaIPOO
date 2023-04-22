import entidades.Cancion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cancion cancion = new Cancion();

        System.out.println("Ingresar el autor de la cancion: ");
        cancion.setAutor(scanner.next());

        System.out.println("Ingresar el titular de la cancion: ");
        cancion.setTitular(scanner.next());

        System.out.println("El autor de la cancion es: " + cancion.getAutor());
        System.out.println("El titular de la cancion es: " + cancion.getTitular());

    }
}