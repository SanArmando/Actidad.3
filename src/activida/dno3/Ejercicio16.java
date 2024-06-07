
package activida.dno3;

/**
 *
 * @author USR-79M2
 */
public class Ejercicio16 {
    /**Realizar una matriz 5x5, inicializarla totalmente en 1
     * y luego en la diagonal
     * trasversa colocar el número cero (0). 
     * Imprimir la matriz
     */
    
public static void main(String[] args) {
    
int[][] matriz = new int[5][5];

// Inicializar la matriz con 1
   for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 5; j++) {
     matriz[i][j] = 1;
    }
   }
    // Colocar 0 en la diagonal trasversa
     for (int i = 0; i < 5; i++) {
      matriz[i][4 - i] = 0;
     }
    // Imprimir la matriz
     for (int i = 0; i < 5; i++) {
       for (int j = 0; j < 5; j++){
     System.out.print(matriz[i][j] + " ");{
    }
     System.out.println();   
    }
   }
  }
}
