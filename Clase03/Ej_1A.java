// Autor: Joel Fiaré
// Se deberían imprimir en pantall:
// La letra 'o' aparece 2 veces en el String 'Hola Mundo'

public class Ej_1A {
    public static void main(String[] args) {

        String str = "Hola Mundo"; //str el String en el que se buscará la letra
        char letra = 'o'; //letra es la letra que se buscara en el String
        int contador = 0; //el contador de la cantidad de apariciones de la letra en el String

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letra) {
                contador++;
            }
        }
        System.out.println("La letra '" + letra + "' aparece " + contador + " veces en el String '" + str + "'");
    }
}