// Seguimiento1 Ejercicio17
// Juan Sebastian Posada Rodriguez
package ejercicio17seg1;
import java.util.Scanner;

public class Ejercicio17Seg1 {
    public static void main(String[] args) {        // Definicion variables
        double r, area, longitud;

        System.out.println("Digite el valor del radio:");    // Entrada r
        Scanner entrada = new Scanner(System.in);
        r = entrada.nextDouble();

        area = (r*r)* 3.14;                //Calculo area
        longitud = 2 * 3.14 * r;            //Calculo longitud

        System.out.println("El area del circulo es: " + area + "cm**2");
        System.out.println("La longitud de la circunferencia es: " + longitud + "cm");
    }
}

