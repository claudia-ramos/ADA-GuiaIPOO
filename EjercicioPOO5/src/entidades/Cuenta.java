package entidades;

import java.util.Scanner;

public class Cuenta {
    private int numeroCuenta;
    private long numeroDNI;
    private double saldo = 0.0;
    private double interes;

    public Cuenta() {

    }

    public Cuenta(int numeroCuenta, long numeroDNI, double saldo, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.numeroDNI = numeroDNI;
        this.saldo = saldo;
        this.interes = interes;
    }

    public double getInteres() {
        return interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getNumeroDNI() {
        return numeroDNI;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setNumeroDNI(long numeroDNI) {
        this.numeroDNI = numeroDNI;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar el numero de DNI del titular: ");
        numeroDNI = scanner.nextLong();

        System.out.println("Ingresar el numero de cuenta del titular: ");
        numeroCuenta = scanner.nextInt();

        System.out.println("Ingresar el saldo de la cuenta: ");
        saldo = scanner.nextDouble();

        System.out.println("Ingresar el interes de la cuenta: ");
        interes = scanner.nextDouble();
    }

    public void ingresar(double ingreso) {
        saldo = saldo + ingreso;
    }

    public void retirar(double retiro) {
        double saldoActualizado = saldo - retiro;
        if (saldoActualizado < 0.0) {
            saldo = 0;
        } else {
            saldo = saldoActualizado;
        }
    }

    public void extracionRapida() {
        double saldoARetirar = saldo * 0.2;
        saldo = saldo - saldoARetirar;
    }

    public void consultarSaldo() {
        System.out.println("El saldo disponible es: " + saldo);
    }

    public void consultarDatos() {
        System.out.println("El numero de cuenta es" + numeroCuenta);
        System.out.println("El numero de DNI del titular es: " + numeroDNI);
        System.out.println("El interes del a cuenta es: " + interes);
        System.out.println("El saldo de la cuenta es: " + saldo);
    }
}
