/*Escribir un algoritmo que calcule el factorial de un número ingresado
por teclado. */
package guia2;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para calcular su factorial: ");
        int numero = leer.nextInt();
        
        int factorial=1;
        
        for(int indice=1;indice<numero;indice++){
            factorial=factorial*(indice+1);
        }
        System.out.println("----------------------------------------------");
        System.out.println("El factorial de "+numero+" es: ");
        System.out.println(factorial);
    }
    
}
