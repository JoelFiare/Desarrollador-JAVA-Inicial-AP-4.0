// Autor: Joel Fiaré
// Imprime en pantalla:
// Numeros en orden descendente: 35,18,15

import java.util.Arrays;

public class Ej_1A {
    public static void main(String[] args) {

        int[] numeros = {18, 15, 35}; //arreglo con 3 numeros para ser ordenados
        String orden = "descendente"; //ascendente o descendente

        if (orden.equals("ascendente")) {
            Arrays.sort(numeros);
        } else {
            Arrays.sort(numeros);
            int aux;
            for (int i = 0; i < numeros.length / 2; i++) {
                aux = numeros[i];
                numeros[i] = numeros[numeros.length - 1 - i];
                numeros[numeros.length - 1 - i] = aux;
            }
        }

        System.out.print("Numeros en orden " + orden + ": ");
        for (int i = 0; i < 3; i++) {
            if (i < 2) {
                System.out.print(numeros[i] + ",");
            } else {
                System.out.print(numeros[i]);
            }
        }
    }
}