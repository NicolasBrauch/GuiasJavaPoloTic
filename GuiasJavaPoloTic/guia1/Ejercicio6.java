/*Pedir al usuario que ingrese el precio de un producto y el porcentaje
de descuento. A continuación mostrar por pantalla el importe
descontado y el importe a pagar. */
package guia1;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        double precio=leer.nextDouble();
        System.out.println("Ingrese el porcentaje de descuento del producto: ");
        double porcentaje=leer.nextDouble();
        double descuento =(porcentaje*precio)/100;
        System.out.println("-------------------------------------------------");
        System.out.println("importe descontado: "+ descuento);
        System.out.println("importe a pagar: "+(precio - descuento));
    }
    
}
