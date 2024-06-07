
package activida.dno3;
// definicion de librerias necesarias
import java.util.Scanner;


/**
 *
 * @author USR-79M2
 */
public class Ejercicio1 {
    
      /*Hacer un programa en Java que sume los siguientes 25 impares
    *que le siguen al número n (n es determinado por el usuario).
    *Imprimir los 25 impares y la suma.
    */
    
    public static void main(String[] args) {
        
        //definicion de varibles u objetos 
        
        Scanner entrada = new Scanner(System.in);
        int n = 0;
        int numeroImpar;
        int suma = 0;
        
        //solicitud de informacion al usuario
        System.out.println("ingrese el numero");
        n = entrada.nextInt();
        // definicion de logica del ejercicio
        // aqui defino mi primere numero impar
        if(n%2==0){
        //codigo si es par
            numeroImpar= n +1;
        }else{
        //codigo si es impar
            numeroImpar= n;
        }
        
        //aqui empiezo a sumar los numeros impares
        for(int i = 0; i < 25; i++){
            System.out.print(numeroImpar + " ");
            numeroImpar = numeroImpar + 2;
            suma = suma + numeroImpar;
        // aqui va hacer lo que entre
        }
        //imprimir resultado si es necesario
        System.out.println("la suma es " + suma);

        
        
    }
  
    
    
}
