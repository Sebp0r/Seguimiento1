// Seguimiento1 Ejercicio14
// Juan Sebastian Posada Rodriguez
package ejercicio14seg1;
import java.util.Scanner;

public class Ejercicio14Seg1 {
    public static void main(String[] args) {
        int  x, x2, x3;  // Definicion variables

        System.out.println("Digite el valor de X:");    // Entrada x
        Scanner entrada = new Scanner(System.in);
        x = entrada.nextInt();

        x2= x*x;                                        // Operaciones
        x3= x*x*x;

        System.out.println("El valor de X: " + x);         // salidas
        System.out.println("El valor de X*2: " + x2);
        System.out.println("El valor de X*3: " + x3);
    }
}
