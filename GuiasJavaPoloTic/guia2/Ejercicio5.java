/*Escribir un algoritmo que lea un valor n por teclado y muestre los
primeros n términos de la sucesión de Fibonacci.*/
package guia2;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar un valor entero: ");
        int n = leer.nextInt();
        
        int vectorDeFibonnacci[]=new int[n+2];
        
        for(int indice=0;indice<=n;indice++){
            if(indice==0){
                vectorDeFibonnacci[indice]=0;
            }else if(indice==1){
                vectorDeFibonnacci[indice]=1;
            }else{
                vectorDeFibonnacci[indice]=vectorDeFibonnacci[indice-2]+vectorDeFibonnacci[indice-1];
            } 
        }
                
        for(int indice=0;indice<=n;indice++){
             System.out.println(vectorDeFibonnacci[indice]);
        }
    }
    
}
