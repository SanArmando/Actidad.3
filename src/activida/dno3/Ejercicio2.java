
package activida.dno3;
import java.util.Scanner;
/**
 *
 * @author USR-79M2
 */
public class Ejercicio2 {
    /** * Hacer un programa en Java que cuente y sume los múltiplos de 5 y 3 
     * (para ser sumado debe verificarse que sea múltiplo de 5 y 3 a la vez)
     * comprendidos entre 1 y n (n es determinado por el usuario).Imprimir la cantidad de múltiplos de 5 y 3.
     * @param args
     */

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();

        int contador = 0;
        int suma = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                contador++;
                suma = suma + i;
            }
        }

        System.out.println("La cantidad de múltiplos de 5 y 3 entre 1 y " + n + " es: " + contador);
        System.out.println("La suma de los múltiplos de 5 y 3 entre 1 y " + n + " es: " + suma);
    }
}