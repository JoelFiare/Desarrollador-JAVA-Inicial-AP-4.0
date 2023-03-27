// Autor: Joel Fiaré
// Imprime en pantalla:
// La suma de los números en el archivo es: 15
package Clase04;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ej_2 {
    public static void main(String[] args) {
        String filePath = "Clase04\\archivo.txt";

        try {
            // Abrir el archivo y crear un lector de texto
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            int sum = 0;

            // Leer cada línea del archivo
            while ((line = bufferedReader.readLine()) != null) {
                // Convertir la línea a un número entero y sumarlo
                int number = Integer.parseInt(line);
                sum += number;
            }

            // Cerrar el lector de texto y mostrar la suma de los números
            bufferedReader.close();
            System.out.println("La suma de los números en el archivo es: " + sum);

        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("El archivo contiene un número inválido: " + e.getMessage());
        }
    }
}
