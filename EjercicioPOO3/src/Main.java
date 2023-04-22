import entidades.Operacion;

public class Main {
    public static void main(String[] args) {
        Operacion operacion = new Operacion();

        operacion.crearOperacion();

        System.out.println("La suma de los dos numeros es: " + operacion.sumar());
        System.out.println("La resta de los dos numeros es: " + operacion.restar());
        System.out.println("La multiplicacion de los dos numeros es: " + operacion.multiplicar());
        System.out.println("La division de los dos numeros es: " + operacion.dividir());
    }
}