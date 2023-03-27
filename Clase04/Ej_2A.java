// Autor: Joel Fiaré
// Imprime en pantalla:
// Seleccione la operación (suma o multiplicacion):
// multiplicacion
// El resultado de la multiplicacion de los números en el archivo es: 120
// Seleccione la operación (suma o multiplicacion):
// suma
// El resultado de la suma de los números en el archivo es: 15

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ej_2A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Pedir al usuario que seleccione la operación
        String operacion = "";
        while (!operacion.equals("suma") && !operacion.equals("multiplicacion")) {
            System.out.println("Seleccione la operación (suma o multiplicacion): ");
            operacion = scanner.nextLine();
            if (!operacion.equals("suma") && !operacion.equals("multiplicacion")) {
                System.out.println("Operación no válida. Intente nuevamente.");
            }
        }

        String filePath = "Clase04\\archivo.txt";

        try {
            // Abrir el archivo y crear un lector de texto
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            int resultado = operacion.equals("suma") ? 0 : 1;

            // Leer cada línea del archivo
            while ((line = bufferedReader.readLine()) != null) {
                // Convertir la línea a un número entero y operar
                int number = Integer.parseInt(line);
                if (operacion.equals("suma")) {
                    resultado += number;
                } else if (operacion.equals("multiplicacion")) {
                    resultado *= number;
                }
            }

            // Cerrar el lector de texto y mostrar el resultado
            bufferedReader.close();
            System.out.println("El resultado de la " + operacion + " de los números en el archivo es: " + resultado);

        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("El archivo contiene un número inválido: " + e.getMessage());
        }
    }
}