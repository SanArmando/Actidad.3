
package activida.dno3;
import java.util.Scanner;

/**
 *
 * @author USR-79M2
 */
public class Ejercicio15 {
    
  /**Realizar un programa que genere una matriz 5x6 y se rellene dinámicamente
   *con los números impares partiendo desde n 
   * (n es dada por el usuario) y se imprima.
   */
    
    public static void main(String[] args) {
      
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el número inicial (n): ");
    int n = scanner.nextInt();
    
    // Verificar si n es impar
    if (n % 2 == 0) {
    n++;
    }
    int[][] matriz = new int[5][6];
    int valor = n;
    
    // Rellenar la matriz con números impares
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 6; j++) {
        matriz[i][j] = valor;
         valor += 2;
      }
    }
    
    // Imprimir la matriz
     for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 6; j++) { 
       System.out.print(matriz[i][j] + " ");
      }  
      System.out.println();
     }
    }
    
}
