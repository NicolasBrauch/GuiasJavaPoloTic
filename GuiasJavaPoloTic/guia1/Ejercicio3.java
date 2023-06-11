/*Escribir un programa que lea dos números y realice el cálculo de la
suma, la resta, la multiplicación y la división entre ambos valores. Los
resultados deben mostrarse por pantalla.*/


package guia1;

import java.util.Scanner;


public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);

        System.out.println("Introduce el primer numero: ");
        double numero1=leer.nextInt();
        System.out.println("Introduce el segundo numero: ");
        double numero2=leer.nextInt();
        System.out.println("La suma es: " + (numero1+numero2));
        System.out.println("La resta es: " + (numero1-numero2));
        System.out.println("La multiplicacion es: " + (numero1*numero2));
        System.out.println("La division es: " + (numero1/numero2));

    }
    
}
