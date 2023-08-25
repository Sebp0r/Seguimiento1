//Seguimiento1 Ejercicio12
// Juan Sebastian Posada Rodriguez
package ejercicio12seg1;
import java.util.Scanner;

public class Ejercicio12Seg1 {
    public static void main(String[] args) {
        int hr=48, pagohr=5000, sb;     // Definicion variables
        double sn, ret;

        sb=hr * pagohr;                 // Calculo salario bruto
        ret=sb * (12.5/100);            // Calculo porcentaje retencion
        sn= sb - ret;                   // Calculo salario neto

        System.out.println(sb);         // salidas
        System.out.println(ret);
        System.out.println(sn);
    }
}
