
package activida.dno3;

/**
 *
 * @author USR-79M2
 */
public class Ejercicio13 {
/**Realizar un programa que genere una matriz 7x7, 
 * inicializarla la diagonal principal con el número “0”(cero
 * ), el resto de las posiciones deben ser - (guion)
 * Imprimir la matriz.
 */
    
    public static void main(String[] args) {
        int size = 7; // Tamaño de la matriz
        char[][] matriz = new char[size][size]; // Crear la matriz

        // Inicializar la matriz con guiones
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matriz[i][j] = '-';
            }
        }

        // Inicializar la diagonal principal con ceros
        for (int i = 0; i < size; i++) {
            matriz[i][i] = '0';
        }

        // Imprimir la matriz
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Salto de línea después de cada fila
        }
    }
}

