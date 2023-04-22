import entidades.Cuenta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();4000

        cuenta.ingresarDatos();
        cuenta.consultarDatos();
        cuenta.ingresar(200.0);
        cuenta.consultarSaldo();
        cuenta.extracionRapida();
        cuenta.consultarSaldo();
        cuenta.retirar(100.0);
        cuenta.consultarSaldo();
    }
}