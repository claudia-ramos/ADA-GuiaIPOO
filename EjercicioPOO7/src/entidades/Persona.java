package entidades;

import java.util.Scanner;

public class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private int peso;
    private int altura;

    public Persona() {

    }

    public Persona(String nombre, int edad, String sexo, int peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }

    public int getEdad() {
        return edad;
    }

    public int getPeso() {
        return peso;
    }

    public String getSexo() {
        return sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void crearPersona() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar el nombre de la persona: ");
        nombre = scanner.next();

        System.out.println("Ingresar la edad de la persona: ");
        edad = scanner.nextInt();

        System.out.println("Ingresar el sexo de la persona con F(Femenino), M(Masculino), O(Otro)");
        String sexoAuxiliar = scanner.next();
        if (sexoAuxiliar == "M" || sexoAuxiliar == "F" || sexoAuxiliar == "O") {
            sexo = sexoAuxiliar;
        } else {
            System.out.println("El sexo ingresado no es el correcto, vuelve a crear la persona nuevamente");
            this.crearPersona();
        }

        System.out.println("La altura de la persona es: ");
        altura = scanner.nextInt();

        System.out.println("Ingresar el peso de la persona: ");
        peso = scanner.nextInt();
    }

    public void calcularMC() {
        double numeroMC = peso/ Math.sqrt(altura);
        if (numeroMC < 20) {
            System.out.println("El peso de la persona esta por debajo de su peso ideal");
        } else if (numeroMC >= 20 && numeroMC <= 25) {
            System.out.println("El peso de la persona esta en su peso ideal");
        } else {
            System.out.println("La persona esta en sobrepeso");
        }
    }

    public boolean esMayorDeEdad() {
        if (edad >= 18) {
            return true;
        }
        return false;
    }
}
