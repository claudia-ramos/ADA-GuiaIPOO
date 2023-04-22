package entidades;

import java.util.Scanner;

public class Libro {
    private String titular;
    private String autor;
    private String numPaginas;

    public Libro() {

    }

    public Libro(String titular, String autor, String numPaginas ) {
        this.titular = titular;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public void cargarDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar el nombre del autor del libro: ");
        autor = scanner.next();

        System.out.println("Ingresar el titular del libro: ");
        titular = scanner.next();

        System.out.println("Ingresar el numero de paginas del libro: ");
        numPaginas = scanner.next();
    }

    public void exponerDatos() {
        System.out.println("El autor del libro es: " + autor);
        System.out.println("El titular del libro es: " + titular);
        System.out.println("El numero de paginas del libro es: " + numPaginas);
    }


}
