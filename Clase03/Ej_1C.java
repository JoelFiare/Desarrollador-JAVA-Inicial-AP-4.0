// Autor: Joel Fiaré
// Imprime en pantalla:
// La suma de los números mayores a 5 es 32
package Clase03;
public class Ej_1C {
    public static void main(String[] args) {
        int[] numeros = {4, 7, 2, 9, 1, 16};
        int x = 5;
        int suma = 0;

        // Sumar todos los números mayores a x
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > x) {
                suma += numeros[i];
            }
        }

        // Imprimir la suma
        System.out.println("La suma de los números mayores a " + x + " es " + suma);
    }
}
