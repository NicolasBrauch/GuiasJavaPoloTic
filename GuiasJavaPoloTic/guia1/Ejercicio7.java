/*Escribir un programa que reciba el valor de dos edades y las guarde
en dos variables. Luego el programa debe intercambiar los valores de
ambas variables y mostrarlas por pantalla. Por ejemplo, si el usuario
ingresó los valores edad1 = 24 y edad2 = 35, el programa deberá
mostrar edad1 = 35 y edad2 = 24.*/
package guia1;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Carga de datos
        System.out.println("Ingresa la primera edad: ");
        int edad1=leer.nextInt();
        System.out.println("Ingresa la segunda edad: ");
        int edad2=leer.nextInt();

        //Intercambio de valores
        int aux = edad1;
        edad1 = edad2;
        edad2=aux;
        
        //Impresión por pantalla
        System.out.println("------------------------------------");
        System.out.println("edad 1 : "+edad1);
        System.out.println("edad 2 : "+edad2);
        

    }
    
}
