// Autor: Joel Fiaré
// Imprime en pantalla:
// Texto original: hola mundo
// Texto codificado: ipmb!nvoep
// Texto decodificado: hola mundo
public class Ej_2 {
    public static void main(String[] args) {
        String texto = "hola mundo";
        int desplazamiento = 1;

        String textoCodificado = CifradoCesar.codificar(texto, desplazamiento);
        String textoDecodificado = CifradoCesar.decodificar(textoCodificado, desplazamiento);

        System.out.println("Texto original: " + texto);
        System.out.println("Texto codificado: " + textoCodificado);
        System.out.println("Texto decodificado: " + textoDecodificado);
    }

    public static class CifradoCesar {
        // Método para codificar un string dado un número de desplazamiento
        public static String codificar(String texto, int desplazamiento) {
            StringBuilder resultado = new StringBuilder();
            for (int i = 0; i < texto.length(); i++) {
                char caracter = texto.charAt(i);
                // Calcular el nuevo caracter y agregarlo al resultado
                char nuevoCaracter = (char) ((caracter - ' ' + desplazamiento) % 94 + ' ');
                resultado.append(nuevoCaracter);
            }
            return resultado.toString();
        }

        // Método para decodificar un string dado un número de desplazamiento
        public static String decodificar(String texto, int desplazamiento) {
            StringBuilder resultado = new StringBuilder();
            for (int i = 0; i < texto.length(); i++) {
                char caracter = texto.charAt(i);
                if (caracter != ' ') {
                    // Calcular el nuevo caracter y agregarlo al resultado
                    char nuevoCaracter = (char) ((caracter - ' ' + 94 - desplazamiento) % 94 + ' ');
                    resultado.append(nuevoCaracter);
                } else {
                    // Agregar el espacio en blanco tal cual al resultado
                    resultado.append(caracter);
                }
            }
            return resultado.toString();
        }
    }
}
