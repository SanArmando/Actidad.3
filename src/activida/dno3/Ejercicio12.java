
package activida.dno3;

/**
 *
 * @author USR-79M2
 */
public class Ejercicio12 {
    /**Realizar un programa que genere una matriz 5x5,
     * inicializarla en 2 e imprimirla.
     */
    
     public static void main(String[] args) {
        int[][] matriz = new int[5][5]; // Crea una matriz de 5x5

        // Inicializa la matriz con el valor 2
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = 2;
            }
        }

        // Imprime la matriz
        System.out.println("Matriz 5x5 inicializada con 2:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Salto de línea después de cada fila
        }
    }
}
