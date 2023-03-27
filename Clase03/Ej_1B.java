// Autor: Joel Fiaré
// Imprime en pantalla:
// Ascendente: [8, 5, 3]
// Descendente: [3, 5, 8]
package Clase03;
import java.util.Arrays;

public class Ej_1B {
    public static void main(String[] args) {
        int[] numeros = {8, 3, 5};
        String orden = "descendente"; // Cambiar "descendente" o "ascendente" para ordenar según corresponda
        int n = numeros.length;

        // Ordenar en forma ascendente o descendente según la variable "orden"
        if (orden.equals("ascendente")) {
            Arrays.sort(numeros);
        } else if (orden.equals("descendente")) {
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (numeros[j] < numeros[j + 1]) {
                        int temp = numeros[j];
                        numeros[j] = numeros[j + 1];
                        numeros[j + 1] = temp;
                    }
                }
            }
        } else {
            System.out.println("Orden inválido");
            return;
        }

        // Imprimir el array ordenado en forma ascendente
        System.out.print("Ascendente: [");
        for (int i = 0; i < n; i++) {
            System.out.print(numeros[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Imprimir el array ordenado en forma descendente
        System.out.print("Descendente: [");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(numeros[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}