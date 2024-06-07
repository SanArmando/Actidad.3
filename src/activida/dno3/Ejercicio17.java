
package activida.dno3;
import java.util.Random;
/**
 *
 * @author USR-79M2
 */
public class Ejercicio17 {
    /**Generar un arreglo unidimensional de 50 posiciones
     * que se llene con valores aleatorios y contar la cantidad
     * de positivos, negativos y ceros del arreglo.
     * @param args
     */
    
    public static void main(String[] args, String valneg) {
        int valorpos = 0;
        int valorneg = 0; 
        int valorcero = 0;
        Random random = new Random();
        int n = 50;
        int[] arreglo = null;

        // Se llena el arreglo unidimensional con valores aleatorios tanto positivos como negativos
        for (int i = 0; i < n; i++) {
            arreglo[i] = random.nextInt(); 
        }

        // Luego de llenar el arreglo se cuentan positivos, negativos y ceros
        for(int i=0; i<n; i++){
            if(arreglo[i] > 0){
                valorpos++;
            }
            else if(arreglo[i] < 0){
                valorneg++;
            }
            else{
                valorcero++;
            }
        }
        
        // Imprimir resultados
        System.out.println("Este es el arreglo : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " ");
        }
        String valpos = null;
        
        System.out.println("\n\nCantidad de positivos: " + valpos);
        System.out.println("Cantidad de negativos: " + valneg);
        String valcero = null;
        System.out.println("Cantidad de ceros: " + valcero);
    }
}
