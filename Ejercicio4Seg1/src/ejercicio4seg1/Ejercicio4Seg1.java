// Seguimiento1 Ejercicio 4 
// Juan Sebastián Posada Rodríguez

package ejercicio4seg1;

import java.util.Scanner;
public class Ejercicio4Seg1 {
    public static void main(String[] args) {
        int edjuan, edalber, edana, edmama;  /// Definir variables

        System.out.println("Ingrese la edad de juan: "); /// Msj Solicitud entrada
        Scanner entrada = new Scanner(System.in);
        edjuan = entrada.nextInt();                 /// Entrada edad Juan
        edalber = 2 * (edjuan/3);                    /// Calculo edad Alberto
        edana = 4 * (edjuan/3);                    /// Calculo edad Ana
        edmama = edalber + edana + edjuan;          /// Calculo edad Mama

        System.out.println("La edad de Juan es: " + edjuan);
        System.out.println("La edad de Alberto es: " + edalber);
        System.out.println("La edad de Ana es: " + edana);
        System.out.println("La edad de la mama es: " + edmama);
    }
}

