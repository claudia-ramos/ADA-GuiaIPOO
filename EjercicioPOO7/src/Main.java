import entidades.Persona;
import sun.awt.AWTAccessor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.crearPersona();
        persona.calcularMC();
        if (persona.esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona es menor de edad");
        }

    }
}