// Autor: Joel Fiaré
// Imprime en pantalla:
// Ingrese el 1° número:35
// Ingrese el 2° número:15
// Ingrese el 3° número:18
// Ingrese 'a' para ordenar en forma ascendente o 'd' para ordenar en forma descendente: a
// Números ordenados: 15,18,35

import java.util.Arrays;
import java.util.Scanner;

    public class Ej_1B {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int[] numeros = new int[3];
            for (int i = 0; i < 3; i++) {
                boolean ingresoValido = false;
                while (!ingresoValido) {
                    System.out.print("Ingrese el " + (i + 1) + "° número:");
                    if (scanner.hasNextInt()) {
                        numeros[i] = scanner.nextInt();
                        ingresoValido = true;
                    } else {
                        scanner.next();
                        System.out.println("Error: Debe ingresar un número entero.");
                    }
                }
            }

            System.out.print("Ingrese 'a' para ordenar en forma ascendente o 'd' para ordenar en forma descendente: ");
            char ordenamiento = scanner.next().charAt(0);

            if (ordenamiento != 'a' && ordenamiento != 'd') {
                System.out.println("La letra de ordenamiento debe ser 'a' para ascendente o 'd' para descendente");
                return;
            }

            if (ordenamiento == 'a') {
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

            System.out.print("Números ordenados: ");
            for (int i = 0; i < 3; i++) {
                if (i < 2) {
                    System.out.print(numeros[i] + ",");
                } else {
                    System.out.print(numeros[i]);
                }
            }
        }
    }