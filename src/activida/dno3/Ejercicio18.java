
package activida.dno3;
import java.util.Scanner;
import java.util.Random;


/**
 *
 * @author USR-79M2
 */
public class Ejercicio18 {

    /**
     * Generar una matriz nxn (dado por el usuario) el valor de n debe ser mayor
     * a 2 y menor a 10 y llenarla con números aleatorios.
     *
     * @param args
     */
    public static void main(String[] args) {
        // creando una variable tipo matriz

        
       Scanner entrada = new Scanner(System.in);
        int n = 0;
        Random aleotorio = new Random();

        // se solicita al usuario el tamaño de la matriz
        System.out.println("ingrese el tamano de la matriz porfavor qu sea mayor a 2 y menor a 10 ");
        n = entrada.nextInt();        
        //se le agrega un while en forma de condicional para decirle al usuario que debe ingresar un numero mayor a 2 y menor a 10;
        while(n <3 || n>9){
            
            System.out.println("ingrese el tamano de la matriz porfavor qu sea mayor a 2 y menor a 10 ");
            n = entrada.nextInt();
        
        }
        System.out.println("el numero es"+n);
        int matriz[][] = new int[n][n];
        for(int i = 0; i < n; i++ ){
            for(int j = 0; j < n ; j++){
                matriz[i][j] = aleotorio.nextInt(50);
            }
        }
       for(int i = 0; i < n; i++ ){
            for(int j = 0; j < n ; j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
       
    }

}
