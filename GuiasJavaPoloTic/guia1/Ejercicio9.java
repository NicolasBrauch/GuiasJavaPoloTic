/*A partir de una cantidad de pesos que el usuario ingresa a través del
teclado se debe obtener su equivalente en dólares, en euros, en
guaraníes y en reales. Para este ejercicio se consideran las siguientes
tasas:*/
package guia1;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Carga de datos
        System.out.println("Ingrese una cantidad en pesos: ");
        double pesos = leer.nextDouble();
        
        //Conversión de moneda
        double dolares= pesos/231.68;
        double euros =pesos/250.69;
        double guaranies =pesos/31;
        double reales = pesos/46.81;
        

        //Impresión por pantalla
        System.out.println("-----------------------------------------------");
        System.out.println("Equivalente en otras monedas: ");
        System.out.printf("dolares: %.2f %n",dolares);
        System.out.printf("euros: %.2f %n",euros);
        System.out.printf("guaranies: %.2f %n",guaranies);
        System.out.printf("reales: %.2f %n",+ reales );
        
    }
    
    
}
