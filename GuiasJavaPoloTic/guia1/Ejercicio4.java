/*Escribir un programa que lea la estatura de tres personas, calcule el
promedio de la altura de ellos y lo informe.*/

package guia1;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la estatura de la primer persona: ");
        double estatura1=leer.nextDouble();
        System.out.println("Ingrese la estatura de la segunda persona: ");
        double estatura2=leer.nextDouble();
        System.out.println("Ingrese la estatura de la tercera persona: ");
        double estatura3=leer.nextDouble();
        
        double promedio = (estatura1 + estatura2 + estatura3) / 3;
        System.out.println("El promedio de las estaturas es: "+promedio);

    }
    
}
