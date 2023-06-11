/*Escribir un programa que reciba un número entero por teclado. A
continuación, mostrar la tabla de multiplicar de ese número.*/
package guia2;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = leer.nextInt();
    
        System.out.println("------------------------------------------");
        for (int multiplicador=0; multiplicador<=10;multiplicador++){
            System.out.printf("%d %s %d %s %d %n",numero,"x",multiplicador,"=", numero*multiplicador);
        }
    }
    
}
