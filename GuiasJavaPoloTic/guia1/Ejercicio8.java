/*Pedir al usuario que ingrese una temperatura en grados Celsius y
mostrar por pantalla su equivalente en kelvin y grados Fahrenheit. */
package guia1;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Carga de datos
        System.out.println("Ingrese una temperatura en grados Celsius: ");
        double temperatura_celsius= leer.nextDouble();
       
        //Conversiones de temperatura
        double temperatura_kelvin = 273.15+temperatura_celsius;
        double temperatura_farenheit = 1.8*temperatura_celsius;
        
        //Impresión por pantalla
        System.out.println("-----------------------------------------------");
        System.out.println("Kelvin: "+temperatura_kelvin);
        System.out.println("Farenheit: "+temperatura_farenheit);
        
    }
    
}
