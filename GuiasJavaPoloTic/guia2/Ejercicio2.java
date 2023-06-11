/*Escribir un programa que lea una palabra por teclado y determine si
es un palíndromo.*/
package guia2;

import java.util.Scanner;

public class Ejercicio2 {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra para determinar si se trata de un palindromo: ");
        String palabra=leer.next();
        int longitud_palabra = palabra.length();
        
        
        String vector1[]=new String[longitud_palabra/2];
        String vector2[]=new String[longitud_palabra/2];
        
        
        for(int indice=0;indice<longitud_palabra/2;indice++){
            vector1[indice]=palabra.substring(indice, indice+1);
            vector2[indice]=palabra.substring(longitud_palabra-1-indice,longitud_palabra-indice);
        }
           
        int letras_coinciden =0;
        for(int indice=0;indice<vector1.length;indice++){
            if(vector1[indice].equals(vector2[indice])){
                letras_coinciden++;
            }
        }
                
        if(letras_coinciden==longitud_palabra/2){
            System.out.println("Es palindromo");
        }else{
            System.out.println("No es palindromo");
        }
        
    }
    
}
