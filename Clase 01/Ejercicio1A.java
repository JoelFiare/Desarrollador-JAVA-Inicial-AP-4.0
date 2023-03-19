// Autor: Joel Fiaré
// Se deberían mostrar los números:
// 5,6,7,8,9,10,11,12,13,14

public class Ejercicio1A {
    public static void main(String[] args) {

        int numeroInicio = 5;
        int numeroFin = 14;

        System.out.println("Mostrando los números del " + numeroInicio + " al " + numeroFin + ":");
        while (numeroInicio < numeroFin) {
            System.out.print(numeroInicio + ",");
            numeroInicio = numeroInicio + 1;
        }
        System.out.print(numeroFin);
    }
}