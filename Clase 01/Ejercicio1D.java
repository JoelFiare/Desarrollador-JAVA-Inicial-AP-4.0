// Autor: Joel Fiaré
// d) Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden
// Se deberían mostrar los números:
// 14,12,10,8,6
public class Ejercicio1D {
    public static void main(String[] args) {

        int numeroInicio = 5;
        int numeroFin = 14;

        for (int i = numeroFin; i >= numeroInicio + 2; i--) {
            if (i % 2 == 0) {
                System.out.print(i + ",");
            }
        }
        System.out.println(numeroInicio + 1);
    }
}