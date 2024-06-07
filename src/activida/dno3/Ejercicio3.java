
package activida.dno3;
import java.util.Scanner;
/**
 *
 * @author USR-79M2
 */
public class Ejercicio3 {
    /**3.Hacer un programa en Java que, dado un rango, por el usuario,
     * se da número inicial y uno final 
     * (tomar en cuenta que el inicial debe ser menor que el final, hacer 
     * la validación y volver a pedir los dos números si no cumple la condición)
     * y sume los números pares dentro del rango incluyendo
     * el valor inicial y final.
     * @param args
     */
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inicio, fin;

        System.out.print("Ingrese el número inicial: ");
        inicio = scanner.nextInt();
        System.out.print("Ingrese el número final: ");
        fin = scanner.nextInt();

        while (inicio >= fin) {
    }
   }
}