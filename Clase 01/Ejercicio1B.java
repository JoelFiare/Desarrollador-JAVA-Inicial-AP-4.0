// Autor: Joel Fiaré
// b) Mostrar sólo los números pares
// Se deberían mostrar los números:
// 6,8,10,12,14

public class Ejercicio1B {
    public static void main(String[] args) {

        int numeroInicio = 5;
        int numeroFin = 14;

        System.out.println("Mostrando números pares entre " + numeroInicio + " y " + numeroFin + ":");
        while (numeroInicio <= numeroFin) {
            if (numeroInicio % 2 == 0) {
                if (numeroInicio < numeroFin) {
                    System.out.print(numeroInicio + ",");
                } else {
                    System.out.println(numeroFin);
                }
            }
            numeroInicio = numeroInicio + 1;
        }
    }
}