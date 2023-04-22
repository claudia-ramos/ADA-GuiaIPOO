package entidades;

import java.util.Scanner;

public class Operacion {
    private int numero1;
    private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {

    }

    public void crearOperacion() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar el primer numero");
        numero1 = scanner.nextInt();

        System.out.println("Ingresar el segundo numero");
        numero2 = scanner.nextInt();
    }

    public int sumar() {
        return numero1 + numero2;
    }

    public int restar() {
        return numero1 - numero2;
    }

    public int multiplicar() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("No se puede multiplicar por el numero 0");
            return 0;
        } else {
            return numero1 * numero2;
        }

    }

    public int dividir() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("No se puede dividir por el numero 0");
            return 0;
        } else {
            return numero1 / numero2;
        }
    }
}
