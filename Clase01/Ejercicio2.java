// Autor: Joel Fiaré
// d) Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden
// Se deberían mostrar los números:
// 14,12,10,8,6
package Clase01;
public class Ejercicio2 {

    public static void main(String[] args) {

        float ingresosMensuales = 500000;
        byte vehiculosMenoresDe5Anios = 1;
        byte inmuebles = 0;
        boolean embarcacion = false;
        boolean aeronave = false;
        boolean activosSocietarios = false;

        if ((ingresosMensuales >= 489083) || (vehiculosMenoresDe5Anios >= 3) || (inmuebles >= 3) || (embarcacion || aeronave || activosSocietarios)) {
            System.out.println("Esta persona pertenece al segmento de ingresos altos");
        } else {
            System.out.println("Esta persona NO pertenece al segmento de ingresos altos");
        }
    }
}
