package CodigoDeLaClaseOnline;

import java.io.OptionalDataException;

public class Test {
    public static void main(String[] args) {
        String unaPalabra = "unaPalabra";
        String unaPalabra1 = "unaPalabra";
        public static int contarLetra(String unaPalabra1, char letra){

            int cuenta = 0;

            String letraPalabra = "";
            for (int i = 0; i<letraPalabra.length; i++){

                if( letraPalabra.charAt(i)  == letra){

                    cuenta = cuenta + 1;

                }

            }

            return cuenta;

        }
    }
}
