// Autor: Joel Fiaré
// A lo anterior, con una variable extra, elija si se deben mostrar los números
// pares o impares
//pares: 6,8,10,12,14
//impares: 5,7,9,11,13

public class Ejercicio1C {
    public static void main(String[] args) {
        int numeroInicio = 5;
        int numeroFin = 14;
        String esPar = "impares"; //pares - impares

        System.out.println("Se mostraran los números " + esPar + " entre " + numeroInicio + " y " + numeroFin + ":");
        while (numeroInicio <= numeroFin) {
            if (numeroInicio % 2 == 0 && esPar == "pares") {
                if (numeroInicio < numeroFin) {
                    System.out.print(numeroInicio + ",");
                } else {
                    System.out.println(numeroFin);
                }
            } else if (numeroInicio % 2 != 0 && esPar == "impares") {
                if (numeroInicio < numeroFin - 2) {
                    System.out.print(numeroInicio + ",");
                } else {
                    System.out.println(numeroFin - 1);
                }
            }
            numeroInicio = numeroInicio + 1;
        }
    }
}