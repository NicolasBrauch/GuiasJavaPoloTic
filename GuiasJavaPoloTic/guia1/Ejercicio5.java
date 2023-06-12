/*Pedir al usuario que ingrese el valor del radio de una circunferencia.
Calcular y mostrar por pantalla el área y el perímetro.*/

package guia1;

import java.util.Scanner;

// No es necesario importar la clase Math
import java.lang.Math;
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingresa el radio de una circunferencia (en metros): ");
        double radio = leer.nextDouble();
        double area = Math.PI*Math.pow(radio,2);
        double perimetro=2*Math.PI*radio;
        System.out.println("El area es : "+area+" m^2");
        System.out.println("El perimetro es: "+perimetro+" m");
    }
    
}
