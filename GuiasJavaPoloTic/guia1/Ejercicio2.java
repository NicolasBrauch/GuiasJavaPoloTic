/*Escribir un programa en el cual se le pregunte al usuario su nombre.
A continuación, mostrar un mensaje que diga “Hola, ” completando el
mensaje con el nombre que ingresó el usuario.*/

package guia1;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println("Escribe tu nombre: ");
        Scanner leer = new Scanner(System.in);
        String nombre_usuario=leer.next();
        System.out.println("Hola," + nombre_usuario);
        
        
    }
    
}
