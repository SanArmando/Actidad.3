
package activida.dno3;
import java.util.Random;
/**
 *
 * @author USR-79M2
 */
public class Ejercicio14 {
    /**Realizar un programa que genere un arreglo de 50 posiciones
     * y se rellene de con la función ramdom de Java
     * (los números deben ser 1 a 99), luego de llenar hacer 
     * la impresión de la matriz.
     */
    
    public static void main(String[] args) { 
        
    int[] arreglo = new int[50]; // Crear un arreglo de 50 posiciones
    Random random = new Random(); // Crear un objeto Random

    // Llenar el arreglo con números aleatorios entre 1 y 99
    for (int i = 0; i < arreglo.length; i++) {
    arreglo[i] = random.nextInt(99) + 1; // Genera un número aleatorio entre 1 y 99
    }

   // Imprimir el arreglo
   System.out.println("Arreglo generado:");
   for (int i = 0; i < arreglo.length; i++) {
  System.out.print(arreglo[i] + " ");
  }
 }
}